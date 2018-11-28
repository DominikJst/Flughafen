package BessererFlughafen;

import java.util.Scanner;

public class FlugzeitenAusgabe {


    public static void getZeiten(){

        Scanner sc = new Scanner(System.in);

        String flugziel = "NewYork";//sc.nextLine();
        String database = "FlughafenFlugzeiten";//sc.nextLine();
        String collection = "NewYork";//sc.nextLine();

        HelperClass.getAbflugszeit(flugziel, database, collection);
    }
}
