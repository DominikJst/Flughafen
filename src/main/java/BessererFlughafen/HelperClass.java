package BessererFlughafen;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class HelperClass {



    public static String getAbflugszeit(String flugziel, String database, String collection){
       String abflugszeit = new String();
       String ankunftszeit = new String();
       String zeiten = new String();

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("FlughafenFlugzeiten");

        try {
            JSONParser parser = new JSONParser();
            MongoCollection col = mongoDatabase.getCollection("NewYork");
            FindIterable<Document> doc = col.find(new Document("flugziel","NewYork"));
            String string = doc.toString();
            JSONObject json = (JSONObject) parser.parse(string);
            abflugszeit = (String)json.get("abflugszeit");
            ankunftszeit = (String)json.get("ankunftszeit");

            zeiten = "Abflugszeit: " + abflugszeit + "Ankunftszeit: " + ankunftszeit;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return zeiten;
    }
}
