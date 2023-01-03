package midwk_homework_7;

// 11. Write a program to print a string entered by user.

import java.util.Scanner;

public class Q11_String {

    public static void main(String[] args) {


            String myname;
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Your  Name : ");
            myname = sc.nextLine();

            System.out.print("Hello, " + myname);
        }
    }