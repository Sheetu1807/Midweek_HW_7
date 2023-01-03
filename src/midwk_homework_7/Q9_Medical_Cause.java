package midwk_homework_7;

/* 9. Modify the above question to allow student to sit if he/she has medical cause.
Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */

import java.util.Scanner;

public class Q9_Medical_Cause {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of class");
        int mc = sc.nextInt();

        System.out.println("Enter the number of class attended");
        int a = sc.nextInt();
        float per = ( a * 100) / mc;

        System.out.println("percentage : " +per);
        if ( per < 75){

            System.out.println("Do you have any medical cause? Yes or No ? ");
            int choice;
            System.out.println("1 : Yes");
            System.out.println("2 : No");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("You're allowed to sit the exam");
                    break;
                case 2:
                    System.out.println("You're not allowed to sit the exam");
                    break;

            }
        }
        else
            System.out.println("You're allowed to sit in examination room");

    }
}

