package BessererFlughafen;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import java.util.Scanner;

public class FlugzielAnlegen {

    public void zielAnlegen() {

        AdminAuswahl auswahl = new AdminAuswahl();
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("FlughafenFlugzeiten");
        Scanner sc = new Scanner(System.in);


        System.out.println("Moechten Sie ein neues Flugziel hinzufuegen?");
        System.out.println(" ");
        System.out.println("[1] Ja!");
        System.out.println("[2] Nein!");

        String hinzufuegenWahl = sc.nextLine();

      try{
          if (hinzufuegenWahl.equals("1")) {

              System.out.println("Geben Sie bitte das neue Flugziel ein!");
              String neuesZiel = sc.nextLine();
              mongoDatabase.createCollection(neuesZiel);

              System.out.println(" ");
              System.out.println("Das neue Flugziel wurde hinzugefuegt!");
          }

          else{
              System.out.println("Das Flugziel konnte nicht hinzugefuegt werden!");
              System.out.println(" ");
          }

      }catch (Exception e){
          System.out.println("Das Flugziel konnte nicht hinzugefuegt werden!");
          System.out.println(" ");
          auswahl.adminMenue();
      }

    }
}
