package Alles;

public class Geometrie {

    public static String help = "Da laeuft etwas falsch! Bitte Werte auf > 0 ueberpruefen!";

    public static void main (String[] args) {

        zylinder(0, 2);
        kugel(3);
        quader(4, 5, 2);
        }


    public static void zylinder(double r, double h) {
        if (h <= 0) {
            System.out.println(help);
        }
        else if (r <= 0){
            System.out.println(help);
        }

        else {

            double oberflaecheZylinder = 2 * Math.PI * r * (r + h);
            double volumenZylinder = Math.PI * (r * r) * h;
            System.out.println("Volumen Zylinder: " + volumenZylinder + " Oberfläche Zylinder: " + oberflaecheZylinder);
        }
    }

    public static void kugel(double r) {
        if (r <= 0) {
            System.out.println(help);
        }

        else {

            double volumenKugel = (4 / 3) * Math.PI * (r * r * r);
            double umfangKugel = 2 * Math.PI * r;
            double oberflaecheKugel = 4 * Math.PI * (r * r);
            System.out.println("Volumen Kugel: " + volumenKugel + " Umfang Kugel: " + umfangKugel + " Oberflaeche Kugel: " + oberflaecheKugel);
        }
    }

    public static void quader (double a, double b, double c) {
        if (a <= 0) {
            System.out.println(help);
        }
        else if (b <= 0) {
            System.out.println(help);
        }

        else if (c <= 0) {
                System.out.println(help);
            }
            else {

                double volumenQuader = a * b * c;
                double oberflaecheQuader = 2 * a * b + 2 * a * c + 2 * b * c;
                double raumdiagonaleQuader = Math.sqrt((a * a) + (b * b) + (c * c));
                double gesamtkantenlaengeQuader = 4 * a + 4 * b + 4 * c;
                System.out.println("Volumen Quader: " + volumenQuader + " Oberflaeche Quader: " + oberflaecheQuader + " Raumdiagonale Quader: " + raumdiagonaleQuader + " Gesamtkantenlänge Quader: " + gesamtkantenlaengeQuader);
            }
        }

}
