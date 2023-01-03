package midwk_homework_7;

/* 6. A school has the following rules for grading system:
        a. Below 25 - F
        b. 25 to 45 - E
        c. 45 to 50 - D
        d. 50 to 60 - C
        e. 60 to 80 - B
        f. Above 80 - A
        Ask user to enter marks and print the corresponding grade.
*/

import java.util.Scanner;

public class Q6_School_Grade {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");

        int g = sc.nextInt();
        if (g < 25){
            System.out.println("F");

        }
        else if (( g >= 25) && ( g < 45)){
            System.out.println("E");

        }
        else if (( g >= 45) && ( g < 50)){
            System.out.println("D");

        }
        else if (( g >= 50) && ( g < 60)){
            System.out.println("C");

        }
        else if (( g >= 60) && ( g < 80)){
            System.out.println("B");

        }
        else if (( g >= 80) && (g <= 100)){
            System.out.println("A");

        }
        else{
            System.out.println("Not correct marks");
        }
    }
}

