package Alles;

public class ComputerPI {
    public static void WieIstPi() {

        double zaehler = 1;
        double nenner = 3;

        double pi;
        double ergebnis = 1;

        for (int i = 2; i <= 1000000000; i++)
        {

            if (i % 2 == 1) {
                ergebnis += zaehler / nenner;
            }

            else {
                ergebnis -= zaehler / nenner;
            }
        nenner += 2;
        }


        pi = ergebnis * 4;

        System.out.println(pi);


    }
}
