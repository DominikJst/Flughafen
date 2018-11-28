package BessererFlughafen;

import java.util.Scanner;


public class AdminAuswahl {


    public void adminMenue() {

        AdminPasswortAendern passwortAendern = new AdminPasswortAendern();
        AdminAccountAnlegen accountAnlegen = new AdminAccountAnlegen();
        FlugzeitenBearbeitenAuswahl zeitenBearbeiten = new FlugzeitenBearbeitenAuswahl();
        FluegeAnlegen flugAnlegen = new FluegeAnlegen();
        FlugzielAnlegen FlugzielAnlegen = new FlugzielAnlegen();
        FlugzielFlugLoeschen loeschen = new FlugzielFlugLoeschen();

        Scanner sc = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("Waehlen Sie zwischen den Aktionen aus!");
        System.out.println("[1] Passwort aendern");
        System.out.println("[2] Account Anlegen");
        System.out.println("[3] Reiseziel Informationen bearbeiten");
        System.out.println("[4] Menues aendern");
        System.out.println("[5] Menue Bestellungen anzeigen");
        System.out.println("[6] FlugzeitenAusgabe bearbeiten");
        System.out.println("[7] Fluege hinzufuegen");
        System.out.println("[8] Flugziel hinzufuegen");
        System.out.println("[9] Flug/Flugziel loeschen");
        System.out.println("[10] Verlassen");

        int adminAuswahl = sc.nextInt();

       try{
           switch (adminAuswahl) {
               case 1:
                   passwortAendern.passwortAendern();
                   adminMenue();
                   break;
               case 2:
                   accountAnlegen.accountAnlegen();
                   adminMenue();
                   break;
               case 3:
                    //Reiseziel Infos
                   break;
               case 4:
                    //Menues bearbeiten
                   break;
               case 5:
                   MenueBestellungInfoAusgabe.InfoAusgabe();
                   adminMenue();
                   break;
               case 6:
                    zeitenBearbeiten.zeitenAendern();
                   break;
               case 7:
                   flugAnlegen.addFluege();
                   break;
               case 8:
                   FlugzielAnlegen.zielAnlegen();
               case 9:
                   loeschen.loeschenWahl();
                   break;
               case 10:
                   exit();
               default:
                   System.out.println("Bitte gueltige Eingaben taetigen!");
                   System.out.println(" ");
                   adminMenue();
                   break;
           }

       } catch(Exception e){
           System.out.println("Bitte eine gueltige Auswahl treffen!");
           System.out.println(" ");
           adminMenue();
       }
    }


    public void exit() {
        System.out.println("Kehre zum Hauptmenue zurueck!");
        System.out.println(" ");
        InfoTerminal.infoTerminal();
    }

}







