package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        System.out.println(">>>--------------- TASK 1 ---------------<<<");
        System.out.println("Please enter two numbers ");
        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();
        int sum = num1 + num2;
        System.out.println("The number 1 entered by user is = " + num1);
        System.out.println("The number 2 entered by user is = " + num2);
        System.out.println("The sum of numbers 1 and 2 entered by user is = " + sum);


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        System.out.println("Please enter another two numbers ");
        int num3 = userInput.nextInt();
        int num4 = userInput.nextInt();
        System.out.println("The product of the given 2 numbers is: " + num3*num4);
        userInput.nextLine();


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        System.out.println("Please enter two floating numbers ");
        double num5 = userInput.nextDouble();
        double num6 = userInput.nextDouble();
        System.out.println("The sum of the given numbers is = " + (num5+num6));
        System.out.println("The product of the given numbers is = " + num5*num6);
        System.out.println("The subtraction of the given numbers is = " + (num5-num6));
        System.out.println("The division of the given numbers is = " + num5/num6);
        System.out.println("The remainder of the given numbers is = " + num5%num6);


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        System.out.println("1.\t\t" + (-10 + 7 * 5));
        System.out.println("2.\t\t" + (72+24) % 24);
        System.out.println("3.\t\t" + (10 + -3*9 / 9));
        System.out.println("4.\t\t" + (5+(18/3)*3-(6%3)));


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        System.out.println("Please enter two numbers ");
        int num7 = userInput.nextInt();
        int num8 = userInput.nextInt();
        int averageOfTwo = (num7 + num8)/2;
        System.out.println("The average of the given numbers is: " + averageOfTwo);


        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        System.out.println("Please enter five numbers ");
        int num9 = userInput.nextInt();
        int num10 = userInput.nextInt();
        int num11 = userInput.nextInt();
        int num12 = userInput.nextInt();
        int num13 = userInput.nextInt();
        int averageOfFive = (num9 + num10 + num11 + num12 + num13)/5;
        System.out.println("The average of the given numbers is: " + averageOfFive);


        System.out.println("\n>>>--------------- TASK 7 ---------------<<<");
        System.out.println("Please enter three numbers ");
        int num14 = userInput.nextInt();
        int num15 = userInput.nextInt();
        int num16 = userInput.nextInt();
        System.out.println("The " + num14 + " multiplied with " + num14 + " is = " + num14*num14);
        System.out.println("The " + num15 + " multiplied with " + num15 + " is = " + num15*num15);
        System.out.println("The " + num16 + " multiplied with " + num16 + " is = " + num16*num16);


        System.out.println("\n>>>--------------- TASK 8 ---------------<<<");
        System.out.println("Enter a value for a side of a square ");
        int side = userInput.nextInt();
        System.out.println("Perimeter of the square = " + 4*side);
        System.out.println("Area of the square = " + side*side);


        System.out.println("\n>>>--------------- TASK 9 ---------------<<<");
        double yearly = 90_000;
        System.out.println("A Software Engineer in Test can earn $" + yearly*3 + " in 3 years.");


        System.out.println("\n>>>--------------- TASK 10 ---------------<<<");
        userInput.nextLine();
        System.out.println("What is your favorite book?");
        String favBook = userInput.nextLine();
        System.out.println("What is your favorite color?");
        String favColor = userInput.nextLine();
        System.out.println("What is your favorite number?");
        int favNumber = userInput.nextInt();
        System.out.println("User's favorite book is: " + favBook + " \nUser's favorite color is: " + favColor + "\nUser's favorite number is: " + favNumber);


        System.out.println("\n>>>--------------- TASK 11 ---------------<<<");
        userInput.nextLine();
        System.out.println("Please enter your first name ");
        String fName = userInput.nextLine();
        System.out.println("Please enter your last name ");
        String lName = userInput.nextLine();
        System.out.println("Please enter your age ");
        int age = userInput.nextInt();
        System.out.println("Please enter your email address ");
        String email = userInput.next();
        userInput.nextLine();
        System.out.println("Please enter your phone number ");
        String phone = userInput.nextLine();
        System.out.println("Please enter your address ");
        String address = userInput.nextLine();
        System.out.println("User who joined this program is " + fName + " " + lName + ". " + fName + "'s age is " + age + ". " + fName + "'s email \naddress is " + email + ", phone number is " + phone + ", and address \nis " + address + ".");

    }
}
