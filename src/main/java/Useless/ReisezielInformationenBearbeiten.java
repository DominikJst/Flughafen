package Useless;


import java.util.*;

public class ReisezielInformationenBearbeiten {

    public static void ReiseInfosAendern(){

        String textAenderung = "Welchen Wert wollen Sie aendern?";
        String neuenWertText = "Geben Sie den neuen Wert ein!";

        Scanner sc = new Scanner(System.in);

        Mallorca malleInfo = new Mallorca("", "", "");
        NewYork yorkInfo = new NewYork("", "", "");
        Sydney sydneyInfo = new Sydney("", "", "");
        ArrayList<Temperatur> tempListe = new  ArrayList<Temperatur>();


        System.out.println("Wählen Sie ein Reiseziel!");
        System.out.println("[1] Palma de Mallorca");
        System.out.println("[2] NewYork");
        System.out.println("[3] Sydney");
        System.out.println("[4] Verlassen");

        String reisezielAenderung = sc.nextLine();

        if(reisezielAenderung.equals("1")){

            malleInfo.ReiseinfosMalle();

            System.out.println(textAenderung);
            System.out.println("[1] Temperatur");
            System.out.println("[2] Wetter");
            System.out.println("[3] Bevoelkerungsanzahl");
            System.out.println("[4] Verlassen");
            System.out.println(" ");

            String malleAenderung = sc.nextLine();

            if(malleAenderung.equals("1")) {

                System.out.println(neuenWertText);

                String neuTemp = sc.nextLine();

                tempListe.get(0).setTemp(neuTemp);

            }
            else if(malleAenderung.equals("2")){

                System.out.println(neuenWertText);

                String neuWetter = sc.nextLine();

                malleInfo.setWetter(neuWetter);
            }

            else if(malleAenderung.equals("3")){

                System.out.println(neuenWertText);

                String neuBevAnz = sc.nextLine();

                malleInfo.setBevoelkerungsAnzahl(neuBevAnz);
            }

            else if(malleAenderung.equals("4")){
                System.out.println("Kehre zum Hauptmenue zurueck!");
                System.out.println(" ");

            }

            else{
                System.out.println("Bitte gueltige Auswahl treffen!");
                System.out.println("Kehre zur Auswahl zurueck!");
                System.out.println(" ");
                ReiseInfosAendern();
            }

        }

        else if(reisezielAenderung.equals("2")){

            yorkInfo.ReiseinfosYork();

            System.out.println(textAenderung);
            System.out.println("[1] Temperatur");
            System.out.println("[2] Wetter");
            System.out.println("[3] Bevoelkerungsanzahl");
            System.out.println("[4] Verlassen");
            System.out.println(" ");

            String yorkAenderung = sc.nextLine();

            if(yorkAenderung.equals("1")) {

                System.out.println(neuenWertText);

                String neuTemp = sc.nextLine();

                yorkInfo.setTemperatur(neuTemp);
            }

            else if(yorkAenderung.equals("2")){

                System.out.println(neuenWertText);

                String neuWetter = sc.nextLine();

                yorkInfo.setWetter(neuWetter);
            }

            else if(yorkAenderung.equals("3")){

                System.out.println(neuenWertText);

                String neuBevAnz = sc.nextLine();

                yorkInfo.setBevoelkerungsAnzahl(neuBevAnz);
            }

            else if(yorkAenderung.equals("4")){
                System.exit(0);
            }

            else{
                System.out.println("Bitte gueltige Auswahl treffen!");
                System.out.println("Kehre zur Auswahl zuruek!");
                System.out.println(" ");
                ReiseInfosAendern();
            }
        }

        else if(reisezielAenderung.equals("3")){

            sydneyInfo.ReiseinfosSydney();

            System.out.println(textAenderung);
            System.out.println("[1] Temperatur");
            System.out.println("[2] Wetter");
            System.out.println("[3] Bevoelkerungsanzahl");
            System.out.println("[4] Verlassen");

            String sydneyAenderung = sc.nextLine();

            if(sydneyAenderung.equals("1")){

                System.out.println(neuenWertText);

                String neuTemp = sc.nextLine();

                sydneyInfo.setTemperatur(neuTemp);
            }

            else if(sydneyAenderung.equals("2")){

                System.out.println(neuenWertText);

                String neuWetter = sc.nextLine();

                sydneyInfo.setWetter(neuWetter);
            }

            else if(sydneyAenderung.equals("3")){

                System.out.println(neuenWertText);

                String neuBevAnz = sc.nextLine();

                sydneyInfo.setBevoelkerungsAnzahl(neuBevAnz);
            }

            else if(sydneyAenderung.equals("4")){
                System.exit(0);
            }

            else{
                System.out.println("Bitte gueltige Auswahl treffen!");
                System.out.println("Kehre zur Auswahl zurueck!");
                System.out.println(" ");
                ReiseInfosAendern();
            }
        }

        else if(reisezielAenderung.equals("4")){
            System.exit(0);
        }

        else{
            System.out.println("Bitte gueltige Auswahl treffen!");
            System.out.println("Kehre zur Auswahl zurueck!");
            System.out.println(" ");
            ReiseInfosAendern();
        }




    }
}
