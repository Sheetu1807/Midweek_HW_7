package midwk_homework_7;

// 7. Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.Scanner;

public class Q7_People_Age {

    public static void main(String[] args)  {

        int age1, age2, age3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of Person 1:  ");

        age1=sc.nextInt();

        System.out.print("Enter the age of Person 2:  ");

        age2=sc.nextInt();

        System.out.print("Enter the age of Person 3:   ");

        age3=sc.nextInt();

        if (age1 > age2 && age1 > age3)

            System.out.println("Person 1 is the Oldest.");

        else if (age2 > age1 && age2 > age3)

            System.out.println("Person 2 is the Oldest.");

        else if (age3 > age1 && age3 > age2)

            System.out.println("Person 3 is the Oldest.");

        else    {

            System.out.println("All have equal ages.");

            System.exit(0);

        }

        if (age1 < age2 && age1 < age3)

            System.out.println("Person 1 is the Youngest.");

        else if (age2 < age1 && age2 < age3)

            System.out.println("Person 2 is the Youngest.");

        else if (age3 < age1 && age3 < age2)

            System.out.println("Person 3 is the Youngest.");

        sc.close();

    }
}


