package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {


        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        fizzBuzz1(3);
        System.out.println();
        fizzBuzz1(5);
        System.out.println();
        fizzBuzz1(18);


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525"));


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(findBiggestNumber("525"));


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));





    }


    public static void fizzBuzz1(int goal){
        for (int i = 1; i <= goal; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }


    public static String fizzBuzz2(int num){
            if (num % 15 == 0) return "FizzBuzz";
            else if (num % 3 == 0) return "Fizz";
            else if (num % 5 == 0) return "Buzz";
            else return String.valueOf(num);
    }


    public static int findSumNumbers(String str){
        ArrayList<String> listS = new ArrayList<>(Arrays.asList(str.split("[\\D]{1,}")));
        int sum = 0;
        for (String element : listS) {
            if (!element.isEmpty()) sum += Integer.parseInt(element);
        }
        return sum;
    }


    public static int findBiggestNumber(String text){
        ArrayList<String> listT = new ArrayList<>(Arrays.asList(text.split("[\\D]{1,}")));
        int max = Integer.MIN_VALUE;
        if(listT.isEmpty()) return 0;
        else{
            for (int i = 0; i < listT.size(); i++) {
                if (!listT.get(i).isEmpty() && Integer.parseInt(listT.get(i)) > max) max = Integer.parseInt(listT.get(i));
            }
        }
        return max;
    }


    public static String countSequenceOfCharacters(String string){
        if(string.isEmpty()) return "";
        String newS = "";
        for (int i = 0; i < string.length(); i++) {
            int count = 1;
            for (int j = i+1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    count++;
                    i++;
                }
                else break;
            }
            newS = newS + count + string.charAt(i);
        }
        return newS;
    }



}
