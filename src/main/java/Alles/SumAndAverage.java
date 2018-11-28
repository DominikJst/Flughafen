package Alles;

public class SumAndAverage {


    public static void getResult (){

        int zahl = 1;
        int ergebnis = 0;


        while (zahl <= 100) {
            ergebnis += zahl++;
    }

        double Durchschnitt;


            Durchschnitt = (float)ergebnis /100;





        System.out.println("The Sum is " + ergebnis + " The average is " + Durchschnitt);

        }

    }
