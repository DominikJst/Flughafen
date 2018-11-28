package BessererFlughafen;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Iterator;
import java.util.Scanner;


public class ZeitenAendern {

    public void flugzeiten() {


        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("FlughafenFlugzeiten");
        Scanner sc = new Scanner(System.in);

        for (String colls : mongoDatabase.listCollectionNames()) {

            System.out.println(colls);
        }

        try {
            System.out.println(" ");

            System.out.println("Für welches Flugziel moechten Sie die Zeiten aendern?");
            String collWahl = sc.nextLine();

            MongoCollection collection = mongoDatabase.getCollection(collWahl);


            FindIterable<Document> iterDoc = collection.find();
            int i = 1;
            Iterator it = iterDoc.iterator();

            while (it.hasNext()) {
                System.out.println(it.next());
                i++;

                System.out.println(" ");
            }

            System.out.println("Geben Sie die id des Fluges ein!");
            String idWahl = sc.nextLine();
            System.out.println("Geben Sie die neue Ankunftszeit ein!");
            String neueAnkunft = sc.nextLine();
            System.out.println("Geben Sie die neue Abflugszeit ein!");
            String neueAbflug = sc.nextLine();


            collection.deleteOne(new Document("id", idWahl)); //

            Document neueZeit = new Document("id", idWahl);
            neueZeit.append("flugziel", collWahl);
            neueZeit.append("abflugszeit", neueAbflug);
            neueZeit.append("ankunftszeit", neueAnkunft);

            collection.insertOne(neueZeit);

            System.out.println("Flug wurde bearbeitet!");

        }catch (Exception e){
            System.out.println("Flug konnte nicht gefunden werden!");
            System.out.println(" ");
        }

    }

}

