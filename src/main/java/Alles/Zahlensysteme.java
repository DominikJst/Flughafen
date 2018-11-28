package Alles;

import java.util.*;

public class Zahlensysteme {

    public static void dualesSystem() {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Geben Sie die umzurechnende Zahl ein.");
            int binaerZahl = sc.nextInt();

            while (binaerZahl > 0) {

                if (binaerZahl % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }

        }catch(Exception e){
            System.out.println("Die Eingabe ist nicht valide!");
            dualesSystem();
        }
    }



}
