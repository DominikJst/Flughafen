package BessererFlughafen;

import java.util.Scanner;

public class Serviceleistungen {

    InfoTerminal terminal = new InfoTerminal();

    public void serviceleistungen() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Waehlen Sie zwischen den angezeigten Serviceleistungen aus!");
        System.out.println("[1] Verpflegung für den Flug waehlen");
        System.out.println("[2] Verlassen");

        int essenWahl = sc.nextInt();

            try{
                switch (essenWahl) {
                    case 1:
                        MenueWahl.Wahl();
                        break;
                    case 2:
                        exit();
                        break;
                    default:
                        System.out.println("Bitte gueltige Eingaben taetigen!");
                        System.out.println(" ");
                        serviceleistungen();
                        break;
                }

            }catch (Exception e){
                System.out.println("Bitte gueltige Eingaben taetigen!");
            }


    }

    public void exit () {
        System.out.println("Kehre zum Hauptmenue zurueck!");
        System.out.println(" ");
        terminal.infoTerminal();
    }


}
