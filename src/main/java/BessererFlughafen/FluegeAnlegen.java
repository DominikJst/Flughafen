package BessererFlughafen;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.apache.commons.lang.RandomStringUtils;
import org.bson.Document;
import java.util.Scanner;

public class FluegeAnlegen {

    public void addFluege() {

        AdminAuswahl auswahl = new AdminAuswahl();
        FlugzielAnlegen anlegen = new FlugzielAnlegen();
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("FlughafenFlugzeiten");
        Scanner sc = new Scanner(System.in);

        for (String colls : mongoDatabase.listCollectionNames()) {

            System.out.println(colls);
        }

        System.out.println(" ");
        System.out.println("Für welches Flugziel moechten Sie einen Flug hinzufuegen?");
        String flugzielWahl = sc.nextLine();

        MongoCollection collection = mongoDatabase.getCollection(flugzielWahl);

        String generatedString = RandomStringUtils.randomAlphabetic(5);

      try{
          if (collection != null) {

              System.out.println("Geben Sie die Abflugszeit ein!");
              String neueAbflug = sc.nextLine();
              System.out.println("Geben Sie die Ankunftszeit ein!");
              String neueAnkunft = sc.nextLine();

              Document neuerFlug = new Document("id", generatedString);
              neuerFlug.append("flugziel", flugzielWahl);
              neuerFlug.append("abflugszeit", neueAbflug);
              neuerFlug.append("ankunftszeit", neueAnkunft);
              collection.insertOne(neuerFlug);

              System.out.println("Der neue Flug konnte hinzugefuegt werden!");
          }

          else{
              System.out.println("Das Flugziel wurde nicht gefunden!");
              System.out.println(" ");
              anlegen.zielAnlegen();
              auswahl.adminMenue();
              }


      }catch (Exception es){
          System.out.println("Flug konnte nicht hinzugefügt werden!");
          System.out.println(" ");
          auswahl.adminMenue();
      }



    }
}

