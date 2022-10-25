package homeworks;

import java.util.Scanner;

public class Homework03 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println(">>>--------------- TASK 1 ---------------<<<");
        System.out.println("Hey user, enter two numbers");
        int num1 = input.nextInt(), num2 = input.nextInt();
        System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        System.out.println("Hey user, enter five numbers");
        int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt(), n4 = input.nextInt(), n5 = input.nextInt();
        System.out.println("Max value = " + Math.max(Math.max(Math.max(Math.max(n5, n4), n3), n2), n1));
        System.out.println("Min value = " + Math.min(Math.min(Math.min(Math.min(n5, n4), n3), n2), n1));


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        int random1 = (int) (Math.random()*51)+50;
        int random2 = (int) (Math.random()*51)+50;
        int random3 = (int) (Math.random()*51)+50;
        System.out.println("Number 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);
        System.out.println("The sum of numbers is = " + (random1 + random2 + random3));


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        double aMoney = 125, mMoney = 220;
        aMoney -= 25.5;
        mMoney += 25.5;
        System.out.println("Alex's money: $" + aMoney);
        System.out.println("Mike's money: $" + mMoney);


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        double savingGoal = 390, dailySavings = 15.60;
        System.out.println((int) (savingGoal / dailySavings));


        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        String s1 = "5", s2 = "10";
        int i1 = Integer.parseInt(s1), i2 = Integer.parseInt(s2);
        System.out.println("-Sum of " + i1 + " and " + i2 + " is = " + (i1 + i2));
        System.out.println("-Product of " + i1 + " and " + i2 + " is = " + (i1 * i2));
        System.out.println("-Division of " + i1 + " and " + i2 + " is = " + (i1 / i2));
        System.out.println("-Subtraction of " + i1 + " and " + i2 + " is = " + (i1 - i2));
        System.out.println("-Remainder of " + i1 + " and " + i2 + " is = " + (i1 % i2));


        System.out.println("\n>>>--------------- TASK 7 ---------------<<<");
        String str1 = "200", str2 = "-50";
        int int1 = Integer.parseInt(str1), int2 = Integer.parseInt(str2);
        System.out.println("The greatest value is = " + Math.max(int1, int2));
        System.out.println("The smallest value is = " + Math.min(int1, int2));
        System.out.println("The average is = " + (int1 + int2)/2);
        System.out.println("The absolute difference is = " + Math.abs(int1 - int2));


        System.out.println("\n>>>--------------- TASK 8 ---------------<<<");
        double dailySave = 3*0.25 + 1*0.10 + 2*0.05 + 1*0.01;
        System.out.println((int)(24/dailySave) + " days");
        System.out.println((int)(168/dailySave) + " days");
        System.out.println("$" + (150*dailySave));


        System.out.println("\n>>>--------------- TASK 9 ---------------<<<");
        double savingTarget = 1250, dailyTarget = 62.5;
        System.out.println((int)(savingTarget/dailyTarget));


        System.out.println("\n>>>--------------- TASK 10 ---------------<<<");
        double carPrice = 14265, monthlyOption1 = 475.50, monthlyOption2 = 951;
        System.out.println("Option 1 will take " + (int)(carPrice / monthlyOption1) + " months");
        System.out.println("Option 2 will take " + (int)(carPrice / monthlyOption2) + " months");


        System.out.println("\n>>>--------------- TASK 11 ---------------<<<");
        System.out.println("Hey user, enter two numbers");
        int number1 = input.nextInt(), number2 = input.nextInt();
        double result = (double)(number1) / (double)(number2);
        System.out.println(result);


        System.out.println("\n>>>--------------- TASK 12 ---------------<<<");
        int rNumber1 = (int) (Math.random()*101);
        int rNumber2 = (int) (Math.random()*101);
        int rNumber3 = (int) (Math.random()*101);

        System.out.println("Random number1 = " + rNumber1);
        System.out.println("Random number2 = " + rNumber2);
        System.out.println("Random number3 = " + rNumber3);

        if (rNumber1 > 25 && rNumber2 > 25 && rNumber3 > 25){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


        System.out.println("\n>>>--------------- TASK 13 ---------------<<<");
        System.out.println("Hey user, enter a number from 1 to 7");
        int number = input.nextInt();

        if (number==1){
            System.out.println("The number entered returns MONDAY");
        } else if (number==2){
            System.out.println("The number entered returns TUESDAY");
        } else if (number==3){
            System.out.println("The number entered returns WEDNESDAY");
        } else if (number==4){
            System.out.println("The number entered returns THURSDAY");
        } else if (number==5){
            System.out.println("The number entered returns FRIDAY");
        } else if (number==6){
            System.out.println("The number entered returns SATURDAY");
        } else {
            System.out.println("The number entered returns SUNDAY");
        }


        System.out.println("\n>>>--------------- TASK 14 ---------------<<<");
        System.out.println("Tell me your exam results?");
        int result1 = input.nextInt(), result2 = input.nextInt(), result3 = input.nextInt();
        int average = (result1 + result2 + result3) / 3;

        if (average >= 70) System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED!");


        System.out.println("\n>>>--------------- TASK 15 ---------------<<<");
        System.out.println("Enter 3 numbers");
        int numberOne = input.nextInt(), numberTwo = input.nextInt(), numberThree = input.nextInt();

        if (numberOne == numberTwo && numberOne== numberThree){
            System.out.println("TRIPLE MATCH");
        }
        else if (numberOne == numberTwo || numberOne== numberThree || numberTwo== numberThree){
            System.out.println("DOUBLE MATCH");
        }
        else {
            System.out.println("NO MATCH");
        }

    }
}
