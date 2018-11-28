package Alles;

public class OddTest {

    public static boolean isOdd(int number) {


        boolean oddOrEven = true;

        if (number % 2 == 0) {
            System.out.print("The number " + number + " is EVEN.");
        } else {
            System.out.print("The number " + number + " is ODD.");

        }
        return oddOrEven;
    }

}
