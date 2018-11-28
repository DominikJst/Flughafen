package Alles;

public class EightTest {

    public static boolean hasEight (int number) {

        boolean hasItEight = true;
        int acht = 8;

        if (Integer.toString(number).contains(Integer.toString(acht))) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

        return hasItEight;
    }

}
