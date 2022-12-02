package homeworks;

import java.util.Arrays;

public class Homework11 {

    public static void main(String[] args) {

        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        System.out.println(noSpace(""));
        System.out.println(noSpace("Java"));
        System.out.println(noSpace(" Hello World   "));
        System.out.println(noSpace("Tech Global"));

        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        System.out.println(replaceFirstLast(""));
        System.out.println(replaceFirstLast("A"));
        System.out.println(replaceFirstLast("    A       "));
        System.out.println(replaceFirstLast("Hello"));
        System.out.println(replaceFirstLast("Tech Global"));

        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        System.out.println(hasVowel(""));
        System.out.println(hasVowel("Java"));
        System.out.println(hasVowel("1234"));
        System.out.println(hasVowel("ABC"));

        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        checkAge(2010);
        checkAge(2006);
        checkAge(2050);
        checkAge(1920);
        checkAge(1800);

        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        System.out.println(averageOfEdges(0, 0, 0));
        System.out.println(averageOfEdges(0, 0, 6));
        System.out.println(averageOfEdges(-2, -2, 10));
        System.out.println(averageOfEdges(-3, 15, -3));
        System.out.println(averageOfEdges(10, 13, 20));

        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        System.out.println(Arrays.toString(noA(new String[]{"java", "hello", "123", "xyz"})));
        System.out.println(Arrays.toString(noA(new String[]{"appium", "123", "ABC", "java"})));
        System.out.println(Arrays.toString(noA(new String[]{"apple", "appium", "ABC", "Alex", "A"})));

        System.out.println("\n>>>--------------- TASK 7 ---------------<<<");
        System.out.println(Arrays.toString(no3or5(new int[]{7, 4, 11, 23, 17})));
        System.out.println(Arrays.toString(no3or5(new int[]{3, 4, 5, 6})));
        System.out.println(Arrays.toString(no3or5(new int[]{10, 11, 12, 13, 14, 15})));

        System.out.println("\n>>>--------------- TASK 8 ---------------<<<");
        System.out.println(countPrimes(new int[]{-10, -3, 0, 1}));
        System.out.println(countPrimes(new int[]{7, 4, 11, 23, 17}));
        System.out.println(countPrimes(new int[]{41, 53, 19, 47, 67}));


    }


    public static String noSpace(String string1){
        return string1.replaceAll(" ", "");
    }


    public static String replaceFirstLast(String string2){
        if (string2.trim().length() < 2) return "";
        return string2.trim().charAt(string2.length()-1) + string2.trim().substring(1, string2.length()-1) + string2.trim().charAt(0);
    }


    public static boolean hasVowel(String string3){
        return string3.toLowerCase().contains("a") ||
                string3.toLowerCase().contains("e") ||
                string3.toLowerCase().contains("i") ||
                string3.toLowerCase().contains("o") ||
                string3.toLowerCase().contains("u");
    }


    public static void checkAge(int yearOfBirth){
        if (yearOfBirth > 2023 || 2022 - yearOfBirth > 100) System.out.println("AGE IS NOT VALID");
        else if (2022 - yearOfBirth < 16) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS ALLOWED");
    }


    public static int averageOfEdges(int a, int b, int c){
        return (Math.min(a,Math.min(b,c)) + Math.max(a,Math.max(b,c)))/2;
    }


    public static String[] noA(String[] strArray){
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].toLowerCase().startsWith("a")) strArray[i] = "###";
        }
        return strArray;
    }


    public static int[] no3or5(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 15 == 0) nums[i] = 101;
            else if (nums[i] % 3 == 0) nums[i] = 100;
            else if (nums[i] % 5 == 0) nums[i] = 99;
        }
        return nums;
    }


    public static int countPrimes(int[] numbers){
        int counter = 0;   // initialize counter
        for (int i = 0; i < numbers.length; i++) {   // loop through the array elements
            int num = numbers[i];   // take array elements one by one
            boolean flag = true;   // flag for prime number is initially set to true
                    if (num <= 1) flag = false;   // any number that is less or equal to 1 is NOT a prime number
                            else {   // if the array element is more than 1
                                for (int j = 2; j < num; j++) {   // loop beginning from 2 through one less than the value of array element
                                    if (num % j == 0) {   // check if the array element is divisible by any number from 2 to one less than the value of the array element
                                        flag = false;   // if it's divisible set flag to false and break the loop
                                        break;
                                    } else flag = true;   // otherwise that array element is only divisible by 1 and itself, so set the flag to true
                                }
                            }
            if (flag) counter++;   // in case of flag being true increase the counter
        }
        return counter;   // return the counter value
    }


}
