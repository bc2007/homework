package homeworks;

import utilities.ScannerHelper;

public class Homework05 {
    public static void main(String[] args) {


        System.out.println(">>>--------------- TASK 1 ---------------<<<");
        String result1 = "";
        for (int i = 1; i <= 100 ; i++) {
            if (i % 7 == 0) result1 += i + " - ";
        }
        System.out.println(result1.substring(0, result1.length()-3));


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        String result2 = "";
        for (int i = 1; i <= 50 ; i++) {
            if (i % 6 == 0) result2 += i + " - ";
        }
        System.out.println(result2.substring(0, result2.length()-3));


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        String result3 = "";
        for (int i = 100; i >= 50 ; i--) {
            if (i % 5 == 0) result3 += i + " - ";
        }
        System.out.println(result3.substring(0, result3.length()-3));


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + i*i);
        }


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);


        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        int factorial = 1;
        int input = ScannerHelper.getANumber();
        if (input == 0) System.out.println(1);
        else {
            for (int i = 1; i <= input; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }


        System.out.println("\n>>>--------------- TASK 7 ---------------<<<");
        String name = ScannerHelper.getAName();
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.toLowerCase().charAt(i) == 'a' || name.toLowerCase().charAt(i) == 'e' || name.toLowerCase().charAt(i) == 'i' || name.toLowerCase().charAt(i) == 'o' || name.toLowerCase().charAt(i) == 'u') counter++;
        }
        System.out.println("There are " + counter + " vowel letters in this full name");


        System.out.println("\n>>>--------------- TASK 8 ---------------<<<");
        int sum8 = 0;
        int num8;
        do {
            num8 = ScannerHelper.getANumber();
            sum8 += num8;
        }
        while (sum8 < 100 && num8 < 100);
        if (num8 >= 100) System.out.println("This number is already more than 100");
        else if (sum8 >= 100) System.out.println("Sum of the entered numbers is at least 100");


        System.out.println("\n>>>--------------- TASK 9 ---------------<<<");
        int x = ScannerHelper.getANumber();
        String result = "";
        int m = 0;
        int n = 1;
        if (x<2) result = result + m;
        else result = result + m + " - " + n;

        for (int j = 2; j < x ; j++) {
            int sumF = m + n;
            result += " - " + sumF;
            m = n;
            n = sumF;
        }
        System.out.println(result);


        System.out.println("\n>>>--------------- TASK 10 ---------------<<<");
        String name10;
        do {
            name10 = ScannerHelper.getAName();
        }
        while (name10.toLowerCase().charAt(0) != 'j');
        System.out.println("End of the program");

    }
}
