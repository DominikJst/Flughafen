package BessererFlughafen;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.Scanner;

public class AdminLogin {

    AdminAuswahl auswahl = new AdminAuswahl();

    public void login() {

        try {

            MongoClient mongoClient = new MongoClient("localhost", 27017);

            MongoDatabase mongoDatabase = mongoClient.getDatabase("Flughafen");
            MongoCollection collection = mongoDatabase.getCollection("user");

            Scanner sc = new Scanner(System.in);
            System.out.println("Bitte geben Sie den Usernamen ein!");

            String userName = sc.nextLine();

            Document doc = (Document) collection.find(Filters.eq("name", userName)).first();

            String userId = doc.getObjectId("_id").toHexString();

            try {
                if (doc != null) {

                    System.out.println("User wurde gefunden!");
                    System.out.println(" ");
                    System.out.println("Bitte das Passwort eingeben!");

                    String userPasswort = sc.nextLine();

                    Document passwortSuche = (Document) collection.find(Filters.eq("passwort", userPasswort)).first();

                    String passId = passwortSuche.getObjectId("_id").toHexString();

                    if (passId.equals(userId)) {

                        System.out.println("Login war erfolgreich!");
                        auswahl.adminMenue();
                    }
                }
            }
            catch (Exception e){
                System.out.println("Login fehlgeschlagen!");
                InfoTerminal.infoTerminal();
            }

        }

        catch (Exception e){
            System.out.println("User wurde nicht gefunden!");
            InfoTerminal.infoTerminal();
        }

    }
}

