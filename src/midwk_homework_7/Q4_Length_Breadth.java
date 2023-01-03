package midwk_homework_7;

// 4. Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;

public class Q4_Length_Breadth {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");

        double length = sc.nextDouble();

        System.out.println("Enter the breadth: ");

        double breadth = sc.nextDouble();

            if (length == breadth)

                System.out.println("It is a Square.");

        else
            System.out.println("It is not a Square...");

    }
}

