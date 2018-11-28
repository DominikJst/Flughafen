package Useless;

import java.util.ArrayList;

import static com.mongodb.client.model.Filters.eq;

public class Zeiten {


    public String anAbZeit;


    public void Zeiten(String anAbZeit){
        this.anAbZeit = anAbZeit;
    }


                //Flüge


    ArrayList<Zeiten> zeitenListe = new  ArrayList<Zeiten>();

   // public void dfskf(){

   //     MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
   //     MongoDatabase mongoDatabase = mongoClient.getDatabase("Flughafen");
    //    MongoCollection collection = mongoDatabase.getCollection("flugzeiten");

    //    Document = collection.find(eq("i", 71)).first();
    //    System.out.println(myDoc.toJson());
   // }

    public void ZeitenAdd(){

    }


    public void malleFlug1(){
        zeitenListe.add(0, new Zeiten());
        zeitenListe.get(0).setAnAbZeit("20.10.2018 16:00 / 20.10.2018 19:00");
        System.out.println("Abflug-Ankunfts Zeiten: " + zeitenListe.get(0).getAnAbZeit());
    }

    public void malleFlug2(){
        zeitenListe.add(0, new Zeiten());
        zeitenListe.get(0).setAnAbZeit("22.10.2018 17:48 / 22.10.2018 20:02");
        System.out.println("Abflug-Anknfts Zeiten: " + zeitenListe.get(0).getAnAbZeit());
    }

    public void yorkFlug1(){
        zeitenListe.add(0, new Zeiten());
        zeitenListe.get(0).setAnAbZeit("25.10.2018 19:53 / 26.10.2018 05:43");
        System.out.println("Abflug-Ankunfts Zeiten: " + zeitenListe.get(0).getAnAbZeit());
    }

    public void yorkFlug2(){
        zeitenListe.add(0, new Zeiten());
        zeitenListe.get(0).setAnAbZeit("29.10.2018 12:32 / 29.10.2018 20:31");
        System.out.println("Abflug-Ankunfts Zeiten: " + zeitenListe.get(0).getAnAbZeit());
    }

    public void sydneyFlug1(){
        zeitenListe.add(0, new Zeiten());
        zeitenListe.get(0).setAnAbZeit("04.11.2018 06:32 / 04.11.2018 22:43");
        System.out.println("Abflug-Ankunfts Zeiten: " + zeitenListe.get(0).getAnAbZeit());
    }

    public void sydneyFlug2(){
        zeitenListe.add(0, new Zeiten());
        zeitenListe.get(0).setAnAbZeit("15.11.2018 15:12 / 16.11.2018 04:58");
        System.out.println("Abflug-Ankunfts Zeiten: " + zeitenListe.get(0).getAnAbZeit());
    }



                //



    public String getAnAbZeit() {
        return anAbZeit;
    }

    public void setAnAbZeit(String anAbZeit){
        this.anAbZeit = anAbZeit;
    }

}
