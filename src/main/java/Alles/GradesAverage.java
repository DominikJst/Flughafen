package Alles;

import java.util.*;

public class GradesAverage {

    public static void schuelerNoten() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");


        int numStudents = sc.nextInt();




            int sum = 0;


            for (int i = 1; i <= numStudents; i++) {
                System.out.print("Enter the grade of student " + (i) + ": ");
                int gradeInput = sc.nextInt();

                if (gradeInput <= 100) {
                    sum = sum + gradeInput;

                } else {
                    System.out.println("Error");
                    i--;
                }
            }
            double durchschnitt = sum / (double) numStudents;


            System.out.println("The average is: " + durchschnitt);
            System.out.println(" ");
            schuelerNoten();

        }






    }












