package Objektorientierung;

public class Main {

    public static void main(String []args){
        Motorrad meinErstesMotorrad = new Motorrad(2 , "125cc", 200, 300);

        meinErstesMotorrad.getKoodinaten();

        System.out.println();

        meinErstesMotorrad.fahren(150, -50);

        meinErstesMotorrad.getKoodinaten();








    }
}
