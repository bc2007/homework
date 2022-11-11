package homeworks;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        System.out.println(countConsonants("JAVA"));
        System.out.println(countConsonants("hello"));
        System.out.println(countConsonants(""));


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        System.out.println(Arrays.toString(wordArray("hello")));
        System.out.println(Arrays.toString(wordArray("java  is    fun")));
        System.out.println(Arrays.toString(wordArray("Hello, nice to meet you!!")));


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        System.out.println(removeExtraSpaces("hello"));
        System.out.println(removeExtraSpaces("java  is    fun"));
        System.out.println(removeExtraSpaces("Hello,    nice to   meet     you!!"));


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        System.out.println(count3OrLess());


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        System.out.println(isDateFormatValid("01/21/1999"));
        System.out.println(isDateFormatValid("1/20/1991"));
        System.out.println(isDateFormatValid("10/2/1991"));
        System.out.println(isDateFormatValid("12-20 2000"));
        System.out.println(isDateFormatValid("12/16/19500"));


        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        System.out.println(isEmailFormatValid("abc@gmail.com"));
        System.out.println(isEmailFormatValid("abc@student.techglobal.com"));
        System.out.println(isEmailFormatValid("a@gmail.com"));
        System.out.println(isEmailFormatValid("abcd@@gmail.com"));
        System.out.println(isEmailFormatValid("abc@gmail"));

    }


    public static int countConsonants(String str){
        Pattern pattern = Pattern.compile("[A-Za-z&&[^AEIOUaeiou]]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
            while(matcher.find()){
                count++;
            }
        return count;
    }


    public static String[] wordArray(String s){
        String[] arrayS = s.split("[\\W]{1,}");
        return arrayS;
    }


    public static String removeExtraSpaces(String str){
        return str.replaceAll("[ ]+", " ");
    }


    public static int count3OrLess() {
        Pattern pattern = Pattern.compile("[A-Za-z]{1,}");
        System.out.println("Please enter a sentence");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        Matcher matcher = pattern.matcher(sentence);
        int counter = 0;
        while (matcher.find()) {
            if (matcher.group().length() >= 1 && matcher.group().length() <= 3) counter++;
        }
        return counter;
    }


    public static boolean isDateFormatValid(String dob){
        //Pattern pattern = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
        return dob.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");
    }


    public static boolean isEmailFormatValid(String email){
        return email.matches("[\\w]{2,}@[\\w]{2,}\\.[\\w.]{2,}");
    }

}
