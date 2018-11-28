package BessererFlughafen;

import java.util.Scanner;

public class FlugzeitenBearbeitenAuswahl {

    public void zeitenAendern() {

        Scanner sc = new Scanner(System.in);
        ZeitenAendern aendern = new ZeitenAendern();
        AdminAuswahl auswahl = new AdminAuswahl();


        System.out.println("Möchten Sie FlugzeitenAusgabe aendern?");
        System.out.println(" ");
        System.out.println("[1] Ja!");
        System.out.println("[2] Nein!");

        int aenderungsWahl = sc.nextInt();


        try {
            switch (aenderungsWahl) {
                case 1:
                    aendern.flugzeiten();
                    auswahl.adminMenue();
                    break;
                case 2:
                    exit();
                    break;
                default:
                    System.out.println("Bitte gueltige Eingaben taetigen!");
                    System.out.println(" ");
                    zeitenAendern();
                    break;
            }

        } catch (Exception e) {
            System.out.println("Bitte eine gueltige Auswahl treffen!");
            System.out.println(" ");
            zeitenAendern();
        }

    }

    public void exit(){
        System.out.println("Kehre zum Hauptmenue zurueck!");
        System.out.println(" ");
        InfoTerminal.infoTerminal();
    }

}
