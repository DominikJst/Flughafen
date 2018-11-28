package BessererFlughafen;


import com.mongodb.*;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.BSON;
import org.bson.Document;

import java.util.Set;

public class ConnectToMongo {

    public static MongoDatabase getMongoFlughafen() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("Flughafen");
        return mongoDatabase;
    }
}
/*

        AdminLogin.AcountAbfrage();




        Set<String> colls = db.getCollectionNames("Reiseziele");


        BasicDBObject doc = new BasicDBObject("name", "Mallorca")
                .append("wetter", "Sonnenschein")
                .append("befoelkerung", "ca. 869.000");
        db.colls.insert(doc);



        BSON bson = new BSON();

        BasicDBObject query = new BasicDBObject();
        query.put("_id", "5bdc0a22dca9638fbfec51a0");

        DBObject dbObj = (DBObject) colls.find(query);
        System.out.println(dbObj);
        collection.find();


*/

