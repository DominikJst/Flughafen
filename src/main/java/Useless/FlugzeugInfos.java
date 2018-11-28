package Useless;


import java.util.*;

public class FlugzeugInfos {


    public void malleFlugzeug() {



        Scanner sc = new Scanner(System.in);


        A350 flugzeugMalle2 = new A350();

        System.out.println("Wollen Sie Informationen ueber die Flugzeuge erfahren?");
        System.out.println("[1] JA!");
        System.out.println("[2] NEIN!");

        String flugzeugWahl = sc.nextLine();

        if (flugzeugWahl.equals("1")) {

            System.out.println("Fuer welchen Flug?");
            System.out.println("[1] Flug 1");
            System.out.println("[2] Flug 2");
            System.out.println("[3] Verlassen!");

            String flugZeuWahl = sc.nextLine();

            if (flugZeuWahl.equals("1")) {


                System.out.println(" ");
                System.out.println("Kehre zum Hauptmenue zurueck!");
                System.out.println(" ");



            }
            else if(flugZeuWahl.equals("2")) {

                flugzeugMalle2.a350Info();
                System.out.println(" ");
                System.out.println("Kehre zum Hauptmenue zurueck!");
                System.out.println(" ");




            }

            else if(flugZeuWahl.equals("3")){
                System.out.println("Kehre zum Hauptmenue zurueck!");
                System.out.println("");

            }

            else{
                System.out.println("Bitte gueltige Auswahl treffen!");
                System.out.println("Kehre zur Auswahl zurück!");
                System.out.println(" ");
                malleFlugzeug();

            }

        }
        else if(flugzeugWahl.equals("2")){
            System.out.println("Kehre zum Hauptmenue zurueck!");
            System.out.println(" ");


        }

        else{
            System.out.println("Bitte gueltige Auswahl treffen!");
            System.out.println("Kehre zur Auswahl zurueck!");
            System.out.println(" ");
            malleFlugzeug();
        }
    }

    public static void yorkFlugzeug(){


        Scanner sc = new Scanner(System.in);

        Boeing777 flugzeugYork1 = new Boeing777();
        A380 flugzeugYork2 = new A380();

        System.out.println("Wollen Sie Informationen ueber die Flugzeuge erfahren?");
        System.out.println("[1] JA!");
        System.out.println("[2] NEIN!");

        String flugzeugWahl = sc.nextLine();

        if(flugzeugWahl.equals("1")){

            System.out.println("Fuer welchen Flug?");
            System.out.println("[1] Flug 1");
            System.out.println("[2] Flug 2");
            System.out.println("[3] Verlassen");

            String flugZeuWahl1 = sc.nextLine();

            if(flugZeuWahl1.equals("1")){

                flugzeugYork1.boeing777Info();
                System.out.println(" ");
                System.out.println("Kehre zum Hauptmenue zurück!");
                System.out.println(" ");



            }

            else if(flugZeuWahl1.equals("2")){

                flugzeugYork2.A380Info();
                System.out.println(" ");
                System.out.println("Kehre zum Hauptmenue zurück!");
                System.out.println(" ");




            }

            else if(flugZeuWahl1.equals("3")){
                System.exit(0);
            }

            else{
                System.out.println("Bitte gueltige Auswahl treffen!");
                System.out.println("Kehre zur Auswahl zurueck!");
                System.out.println(" ");
                yorkFlugzeug();
            }

        }

        else if(flugzeugWahl.equals("2")){
            System.out.println("Kehre zur Auswahl zurueck!");

        }

        else{
            System.out.println("Bitte gueltige Auswahl treffen!");
            System.out.println("Kehre zur Auswahl zurueck!");
            System.out.println(" ");
            yorkFlugzeug();
        }

    }

    public static void sydneyFlugzeuge(){



        Scanner sc = new Scanner(System.in);

        Boeing747 flugzeugSydney1 = new Boeing747();
        Boeing787 flugzeugSydney2 = new Boeing787();

        System.out.println("Wollen Sie Informationen ueber die Flugzeuge erfahren?");
        System.out.println("[1] JA!");
        System.out.println("[2] NEIN!");

        String flugzeugWahl = sc.nextLine();

        if(flugzeugWahl.equals("1")){

            System.out.println("Fuer welchen Flug?");
            System.out.println("[1] Flug 1");
            System.out.println("[2] Flug 2");
            System.out.println("[3] Verlassen");

            String flugZeuWahl = sc.nextLine();

            if(flugZeuWahl.equals("1")){

                flugzeugSydney1.Boeing747Infos();
                System.out.println(" ");
                System.out.println("Kehre zum Hauptmenue zurueck!");
                System.out.println(" ");




            }
            else if(flugZeuWahl.equals("2")){

                flugzeugSydney2.Boeing787Infos();
                System.out.println(" ");
                System.out.println("Kehre zum Hauptmenue zurueck!");
                System.out.println(" ");




            }

            else if(flugZeuWahl.equals("3")){
                System.out.println("Kehre zum Hauptmenue zurueck!");
                System.out.println(" ");

            }

            else{

                System.out.println("Bitte gueltige Auswahl trefen!");
                System.out.println("Kehre zur Auswahl zurueck!");
                System.out.println(" ");
                sydneyFlugzeuge();
            }

        }
        else if(flugzeugWahl.equals("2")){
            System.out.println("Kehre zum Hauptmenue zurueck!");
            System.out.println(" ");

        }

        else {
            System.out.println("Bitte gueltige Auswahl treffen!");
            System.out.println("Kehre zur Auswahl zurück!");
            System.out.println(" ");
        }

    }

}
