package BessererFlughafen;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.Scanner;

public class Reisezielinformationen {

//todo Informationen abrufen

    public void reisezielinformationen() {

        MongoClient mongoClient = new MongoClient("localhost", 27017);

        MongoDatabase mongoDatabase = mongoClient.getDatabase("Flughafen");
        MongoCollection collection = mongoDatabase.getCollection("reiseziele");

        Scanner sc = new Scanner(System.in);

        System.out.println("Fuer welches Reiseziel moechten Sie Informationen haben?");
        System.out.println("[1] Mallorca");
        System.out.println("[2] New York");
        System.out.println("[3] Sydney");
        System.out.println("[4] Verlassen");

        try{
            int infoReise = sc.nextInt();


             switch (infoReise) {
                 case 1:
                     mallorca();
                     break;
                 case 2:
                     newYork();
                     break;
                 case 3:
                     sydney();
                     break;
                 case 4:
                     exit();
                     break;
                 default:
                     System.out.println("Bitte gueltige Eingaben taetigen!");
                     System.out.println(" ");
                     reisezielinformationen();
                     break;
             }

         }
         catch(Exception e){
             System.out.println("Bitte gueltige Auswahl treffen!");
             System.out.println(" ");
             reisezielinformationen();
         }

    }

    public void mallorca() {
       // String abflug = HelperClass.getAbflugszeit("mallorca1", ConnectToMongo.getMongoFlughafen());

       // System.out.println(abflug);

    }

    public void newYork() {


    }

    public void sydney() {


    }

    public void exit() {
        System.out.println("Kehre zum Hauptmenue zurueck!");
        System.out.println(" ");
        InfoTerminal.infoTerminal();
    }

}



