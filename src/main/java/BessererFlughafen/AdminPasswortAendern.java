package BessererFlughafen;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.Scanner;

public class AdminPasswortAendern {


    public void passwortAendern() {

        AdminAuswahl auswahl = new AdminAuswahl();

        Scanner sc = new Scanner(System.in);

        MongoClient mongoClient = new MongoClient("localhost", 27017);

        MongoDatabase mongoDatabase = mongoClient.getDatabase("Flughafen");
        MongoCollection collection = mongoDatabase.getCollection("user");

        try {
            System.out.println("Für welchen User möchten Sie das Passwort ändern?");

            String userPasswortFind = sc.nextLine();

            Document userPasswortAendern = (Document) collection.find(Filters.eq("name", userPasswortFind)).first();

            String newUserId = userPasswortAendern.getObjectId("_id").toHexString();

            try {
                if (userPasswortAendern != null) {

                    System.out.println("User wurde gefunden!");
                    System.out.println(" ");
                    System.out.println("Bitte das neue Passwort eingeben!");

                    String neuesUserPasswort = sc.nextLine();

                    System.out.println("Bitte mit dem alten Passwort bestätigen!");

                    String altesPasswort = sc.nextLine();

                    Document altesPasswortCheck = (Document) collection.find(Filters.eq("passwort", altesPasswort)).first();

                    String newUserPassId = altesPasswortCheck.getObjectId("_id").toHexString();

                    if (newUserId.equals(newUserPassId)) {

                        Bson updatedValue = new Document("passwort", neuesUserPasswort);
                        Bson updateoperation = new Document("$set", updatedValue);
                        collection.updateOne(altesPasswortCheck, updateoperation);
                        System.out.println("Das Passwort wurde erfolgreich geändert!");

                    } else {
                        System.out.println("Passwort konnte nicht geändert werden!");
                    }

                } else {
                    System.out.println("User wurde nicht gefunden!");
                    auswahl.adminMenue();
                }

            } catch (Exception ex) {
                System.out.println("Das Passwort stimmt nicht überein!");
                auswahl.adminMenue();
            }

        } catch (Exception er) {
            System.out.println("User wurde nicht gefunden!");
            auswahl.adminMenue();
        }

    }

}

