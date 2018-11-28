package BessererFlughafen;

import java.util.Scanner;

public class FlugzielFlugLoeschen {

    AdminAuswahl auswahl = new AdminAuswahl();
    FlugzielLoeschen zielLoeschen = new FlugzielLoeschen();
    FlugLoeschen flugEntfernen = new FlugLoeschen();
    Scanner sc = new Scanner(System.in);

    public void loeschenWahl(){

        System.out.println("Waehlen Sie zwischen den Moeglichkeiten!");
        System.out.println(" ");
        System.out.println("[1] Flugziel loeschen");
        System.out.println("[2] Flug loeschen");
        System.out.println("[3] Verlassen");

        int loeschWahl = sc.nextInt();

        try{
            switch (loeschWahl){
                case 1:
                    zielLoeschen.flugzielLoeschen();
                    break;
                case 2:
                    flugEntfernen.flugLoeschen();
                    break;
                case 3:
                    exit();
                    break;
                default:
                    System.out.println("Bitte gueltige Eingaben treffen!");
                    System.out.println(" ");
                    loeschenWahl();
                    break;

            }

        }catch (Exception e){
            System.out.println("Bitte gueltige Auswahl treffen!");
            System.out.println(" ");
        }

    }

    public void exit(){
        System.out.println("Kehre zum AdminMenue zurueck!");
        System.out.println(" ");
        auswahl.adminMenue();
    }

}
