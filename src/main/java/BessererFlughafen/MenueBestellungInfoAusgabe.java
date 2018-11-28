package BessererFlughafen;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.*;

public class MenueBestellungInfoAusgabe {


    public static void InfoAusgabe() {

        AdminAuswahl auswahl = new AdminAuswahl();

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("Flughafen");
        MongoCollection collectionBestellungen = mongoDatabase.getCollection("bestellungen");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Möchten Sie die eingegangenen Bestellungen ansehen?");
        System.out.println("[1] Ja");
        System.out.println("[2] Nein");

        String jaNeinAusgabe = scanner.nextLine();

        System.out.println(" ");


        if (jaNeinAusgabe.equals("1")) {

            FindIterable<Document> iterDoc = collectionBestellungen.find();
            int i = 1;
            Iterator it = iterDoc.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
                i++;

                System.out.println(" ");


            }
        } else {
            System.out.println("Kehre zum Hauptmenue zurueck!");
            System.out.println(" ");
            auswahl.adminMenue();
        }

    }

}







