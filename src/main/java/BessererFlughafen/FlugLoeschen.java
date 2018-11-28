package BessererFlughafen;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Iterator;
import java.util.Scanner;

public class FlugLoeschen {

    MongoClient mongoClient = new MongoClient("localhost", 27017);
    MongoDatabase mongoDatabase = mongoClient.getDatabase("FlughafenFlugzeiten");
    Scanner sc = new Scanner(System.in);

    public void flugLoeschen() {

        try {
            for (String colls : mongoDatabase.listCollectionNames()) {

                System.out.println(colls);
            }

            System.out.println(" ");
            System.out.println("Fuer welches Flugziel moechten Sie Fluege loeschen?");
            System.out.println(" ");

            String flugzielWahl = sc.nextLine();

            MongoCollection collection2 = mongoDatabase.getCollection(flugzielWahl);

            FindIterable<Document> iterDoc = collection2.find();
            int i = 1;
            Iterator it = iterDoc.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
                i++;

                System.out.println(" ");
            }

            System.out.println(" ");
            System.out.println("Geben Sie die ID des Fluges ein!");
            String idFlug = sc.nextLine();
            System.out.println(" ");

            collection2.deleteOne(new Document("id", idFlug));

            System.out.println("Der Flug mit der ID " + idFlug + " wurde geloescht!");
            System.out.println(" ");

        } catch (Exception e) {
            System.out.println("Der Flug konnte nicht gefunden werden!");
            System.out.println(" ");
        }

    }

}
