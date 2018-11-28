package Alles;

import java.util.*;

public class MagicSum {

    public static void main(String[] args) {

        int sentinel = -1;
        int acht = 8;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer or -1 to exit: ");
        int number = sc.nextInt();

        while (number != sentinel) {

            if (Integer.toString(number).contains(Integer.toString(acht))) {

                System.out.print("Enter a positive integer or -1 to exit: ");
                number = sc.nextInt();

            }
            else if (number == -1) {

            }
        }


    }

}
