package BessererFlughafen;

import java.util.Scanner;

public class Fluginformationen {

    public void fluginformationen() {


        Scanner sc = new Scanner(System.in);

        System.out.println("Fuer welches Flugziel moechten Sie Fluginformationen haben?");
        System.out.println("[1] Mallorca");
        System.out.println("[2] New York");
        System.out.println("[3] Sydney");
        System.out.println("[4] Verlassen");

        int flugInfos = sc.nextInt();

           try{
               switch (flugInfos) {
                   case 1:
                       //
                       break;
                   case 2:
                       //
                       break;
                   case 3:
                       //
                       break;
                   case 4:
                       exit();
                       break;
                   default:
                       System.out.println("Bitte gueltige Eingaben taetigen!");
                       System.out.println(" ");
                       fluginformationen();
                       break;
               }
           }
           catch(Exception e){
               System.out.println("Bitte gueltige Auswahl treffen!");
               System.out.println(" ");
               fluginformationen();
           }

    }


    public void exit() {
        System.out.println("Kehre zum Hauptmenue zurueck!");
        System.out.println(" ");
        fluginformationen();
    }


}







