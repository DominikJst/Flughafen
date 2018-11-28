package BessererFlughafen;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.Scanner;

public class FlugzielLoeschen {

    MongoClient mongoClient = new MongoClient("localhost", 27017);
    MongoDatabase mongoDatabase = mongoClient.getDatabase("FlughafenFlugzeiten");
    Scanner sc = new Scanner(System.in);

    public void flugzielLoeschen() {


        try {
            for (String colls : mongoDatabase.listCollectionNames()) {

                System.out.println(colls);
            }

            System.out.println(" ");
            System.out.println("Welches Flugziel moechten Sie loeschen?");

            String flugzielLoeschen = sc.nextLine();

            MongoCollection collection = mongoDatabase.getCollection(flugzielLoeschen);

            if (collection != null) {

                collection.drop();

                System.out.println("Das Flugziel " + flugzielLoeschen + " wurde geloescht!");
                System.out.println(" ");
            } else {
                System.out.println("Loeschen Fehlgeschlagen!");
            }

        } catch (Exception e) {
            System.out.println("Das Flugziel konnte nicht gefunden werden!");
            System.out.println(" ");
        }

    }

}
