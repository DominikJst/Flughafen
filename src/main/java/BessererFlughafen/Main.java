package BessererFlughafen;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen im Infoportal! Bestaetigen Sie mit Enter um fortzufahren!");
        String weiter = sc.nextLine();

        InfoTerminal.infoTerminal();
    }
}
