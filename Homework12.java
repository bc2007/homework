package homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Homework12 {
    public static void main(String[] args) {

        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        System.out.println(noDigit(""));
        System.out.println(noDigit("Java"));
        System.out.println(noDigit("123Hello"));
        System.out.println(noDigit("123Hello World149"));
        System.out.println(noDigit("123Tech456Global149"));


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        System.out.println(noVowel(""));
        System.out.println(noVowel("xyz"));
        System.out.println(noVowel("JAVA"));
        System.out.println(noVowel("125$"));
        System.out.println(noVowel("TechGlobal"));


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        System.out.println(sumOfDigits(""));
        System.out.println(sumOfDigits("Java"));
        System.out.println(sumOfDigits("John’s age is 29"));
        System.out.println(sumOfDigits("$125.0"));


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        System.out.println(hasUpperCase(""));
        System.out.println(hasUpperCase("java"));
        System.out.println(hasUpperCase("John’s age is 29"));
        System.out.println(hasUpperCase("$125.0"));


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        System.out.println(middleInt(1, 1, 1));
        System.out.println(middleInt(1, 2, 2));
        System.out.println(middleInt(5, 5, 8));
        System.out.println(middleInt(5, 3, 5));
        System.out.println(middleInt(-1, 25, 10));


        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        System.out.println(Arrays.toString(no13(new int[]{1, 2, 3 ,4})));
        System.out.println(Arrays.toString(no13(new int[]{13, 2, 3 })));
        System.out.println(Arrays.toString(no13(new int[]{13, 13, 13 , 13, 13})));


        System.out.println("\n>>>--------------- TASK 7 ---------------<<<");
        System.out.println(Arrays.toString(arrFactorial(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{0, 5})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{5 , 0, 6})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{})));


        System.out.println("\n>>>--------------- TASK 8 ---------------<<<");
        System.out.println(Arrays.toString(categorizeCharacters("     ")));
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));





    }



    public static String noDigit(String string1){
        return string1.replaceAll("[0-9]", "");
    }


    public static String noVowel(String string2){
        return string2.replaceAll("[aeiouAEIOU]", "");
    }


    public static int sumOfDigits(String string3){
        int sum = 0;
        for (int i = 0; i < string3.length(); i++) {
            if (Character.isDigit(string3.charAt(i))) sum += Integer.parseInt(string3.substring(i,i+1));
        }
        return sum;
    }


    public static boolean hasUpperCase(String string4){
        boolean hasUpperCase = false;
        for (int i = 0; i < string4.length(); i++) {
            if (Character.isUpperCase(string4.charAt(i))) {
                hasUpperCase = true;
                break;
            }
        }
        return hasUpperCase;
    }


    public static int middleInt(int a, int b, int c){
        int[] arrayN = {a, b, c};
        Arrays.sort(arrayN);
        return arrayN[1];
    }


    public static int[] no13(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 13) numbers[i] = 0;
        }
        return numbers;
    }


    public static int[] arrFactorial(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = 1;
            else {
                int factorial = 1;
                for (int j = 1; j <= nums[i] ; j++) {
                    factorial *= j;
                }
                nums[i] = factorial;
            }
        }

        return nums;
    }


    public static String[] categorizeCharacters(String string8){
        String[] arrayS = new String[3];
        arrayS[0] = string8.trim().replaceAll("[^a-zA-Z]", "");
        arrayS[1] = string8.trim().replaceAll("[^0-9]", "");
        arrayS[2] = string8.trim().replaceAll("[a-zA-Z0-9 ]", "");
        return arrayS;
    }



}
