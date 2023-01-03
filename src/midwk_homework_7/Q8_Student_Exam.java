package midwk_homework_7;

/* 8. A student will not be allowed to sit in exam if his/her attendance is less than 75%.
        Take following input from user
        Number of classes held
        Number of classes attended.
        And print percentage of class attended
Is the student is allowed to sit in exam or not.
 */

import java.util.Scanner;
public class Q8_Student_Exam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Check if student is eligible to sit in the exam or not");

        System.out.println("Enter the number of classes held");

        int a = sc.nextInt();
        System.out.println("Enter the number of classes attended");

        int b = sc.nextInt();
        float percentage = b * 100.f / a;
        System.out.println("Total percentage attendance is " + percentage);

        if (percentage >= 75) {
            System.out.println("You are allowed to sit in the exam");

        } else {
            System.out.println("You are not allowed to sit in the exam");
        }
    }
}


