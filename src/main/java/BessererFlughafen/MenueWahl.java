package BessererFlughafen;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.*;



public class MenueWahl {


    public static void Wahl() {

        InfoTerminal terminal = new InfoTerminal();

        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        MongoDatabase mongoDatabase = mongoClient.getDatabase("Flughafen");
        MongoCollection collection = mongoDatabase.getCollection("bestellungen");

        Scanner sc = new Scanner(System.in);

        System.out.println("Moechten Sie zwischen den Menues waehlen?");
        System.out.println(" ");
        System.out.println("[1] Ja");
        System.out.println("[2] Nein");

        String jaNeinWahl = sc.nextLine();

        try{
            if (jaNeinWahl.equals("1")) {

                System.out.println("Waehlen Sie das Menue!");

                //todo menue auflistung einfügen

                String menueWahl = sc.nextLine();

                System.out.println("Geben Sie Ihren Namen ein! (Nachname, Vorname)");

                String name = sc.nextLine();

                System.out.println("Geben Sie Ihre Flugnummer ein!");

                String flugNummer = sc.nextLine();

                System.out.println("Geben Sie Ihre E-Mail ein!");

                String mail = sc.nextLine();

                //Übermittlung
                Document neueBestellung = new Document("name", name);
                neueBestellung.append("flugNummer", flugNummer);
                neueBestellung.append("email", mail);
                neueBestellung.append("menueWahl", menueWahl);

                collection.insertOne(neueBestellung);


                System.out.println(" ");
                System.out.println("Danke für Ihre Bestellung!");
                System.out.println("Kehre zum Hauptmenue zurueck!");
                System.out.println(" ");

                terminal.infoTerminal();

            } else if (jaNeinWahl.equals("2")) {
                System.out.println("Kehre zum Hauptmenue zurueck!");
                System.out.println(" ");
                terminal.infoTerminal();


            } else {
                System.out.println("Kehre zum Hauptmenue zurueck!");
                System.out.println(" ");
                terminal.infoTerminal();
            }

        }catch (Exception e){
            System.out.println("Bestellung fehlgeschlagen!");
            System.out.println(" ");
        }


    }


}
