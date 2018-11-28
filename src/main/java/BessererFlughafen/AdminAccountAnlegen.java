package BessererFlughafen;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;

public class AdminAccountAnlegen {

    AdminAuswahl auswahl = new AdminAuswahl();
    Scanner sc = new Scanner(System.in);
    MongoClient mongoClient = new MongoClient("localhost", 27017);
    MongoDatabase mongoDatabase = mongoClient.getDatabase("Flughafen");
    MongoCollection collection = mongoDatabase.getCollection("user");

    public void accountAnlegen() {


        try {
            System.out.println("Bitte geben Sie den neuen User ein!");

            String neuUser = sc.nextLine();
            System.out.println(" ");
            System.out.println("Bitte geben Sie das neue Passwort ein!");
            String neuUserPasswort = sc.nextLine();

            Document neuerUser = new Document("name", neuUser);
            neuerUser.append("passwort", neuUserPasswort);

            if(neuUser.equals(neuUserPasswort)){

                System.out.println("Username darf nicht mit Passwort uebereinstimmen!");
                System.out.println(" ");
            }

            else{
                collection.insertOne(neuerUser);

                System.out.println("Neuer User wurde angelegt!");
                System.out.println(" ");
            }

        } catch (Exception er) {
            System.out.println("Neuer User konnte nicht angelegt werden!");
            System.out.println(" ");
            auswahl.adminMenue();

        }

    }

}
