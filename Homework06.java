package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        int[] array1 = {89, 0, 23, 0, 12, 0, 15, 34, 0, 7};
        System.out.println(array1[3]);
        System.out.println(array1[0]);
        System.out.println(array1[9]);
        System.out.println(Arrays.toString(array1));


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        String[] array2 = new String[5];
        array2[1] = "abc";
        array2[4] = "xyz";
        System.out.println(array2[3]);
        System.out.println(array2[0]);
        System.out.println(array2[4]);
        System.out.println(Arrays.toString(array2));


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        int[] array3 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(array3));
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(cartoonDogs));
        boolean hasPluto = false;
        for (String cartoonDog : cartoonDogs) {
            if (cartoonDog.equals("Pluto")) {
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasPluto);


        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));
        boolean hasGarfieldAndFelix = false;
        for (String cartoonCat : cartoonCats) {
            if (cartoonCat == "Garfield" && cartoonCat == "Felix") hasGarfieldAndFelix = true;
        }
        System.out.println(hasGarfieldAndFelix);


        System.out.println("\n>>>--------------- TASK 7 ---------------<<<");
        double[] array7 = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(array7));
        for (double element : array7) {
            System.out.println(element);
        }


        System.out.println("\n>>>--------------- TASK 8 ---------------<<<");
        char[] array8 = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(array8));
        int countLetters = 0, countUpper = 0, countLower = 0, countDigits = 0, countSpecials = 0;
        for (char c : array8) {
            if (Character.isLetter(c)) {
                countLetters++;
                if (Character.isUpperCase(c)) countUpper++;
                else countLower++;
            }
            else if (Character.isDigit(c)) countDigits++;
            else {
                countSpecials++;
            }
        }
        System.out.println("Letters = " + countLetters);
        System.out.println("Uppercase letters = " + countUpper);
        System.out.println("Lowercase letters = " + countLower);
        System.out.println("Digits = " + countDigits);
        System.out.println("Special characters = " + countSpecials);


        System.out.println("\n>>>--------------- TASK 9 ---------------<<<");
        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(objects));
        int countU = 0, countL = 0, countBP = 0, countBookPen = 0;
        for (String object : objects) {
            if (Character.isUpperCase(object.charAt(0))) countU++;
            else countL++;
            if (object.toUpperCase().charAt(0) == 'B' || object.toUpperCase().charAt(0) == 'P') countBP++;
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) countBookPen++;
        }
        System.out.println("Elements starts with uppercase = " + countU);
        System.out.println("Elements starts with lowercase = " + countL);
        System.out.println("Elements starting with B or P = " + countBP);
        System.out.println("Elements having with \"book\" or \"pen\" = " + countBookPen);


        System.out.println("\n>>>--------------- TASK 10 ---------------<<<");
        int[] array10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int count10 = 0, count10More = 0, count10Less = 0;
        for (int i : array10) {
            if (i == 10) count10++;
            else if (i < 10) count10Less++;
            else if (i > 10) count10More++;
        }
        System.out.println(Arrays.toString(array10));
        System.out.println("Elements that are more than 10 = " + count10More);
        System.out.println("Elements that are less than 10 = " + count10Less);
        System.out.println("Elements that are 10 = " + count10);


        System.out.println("\n>>>--------------- TASK 11 ---------------<<<");
        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        int[] that = new int[5];
        for (int i = 0; i < first.length; i++) {
            if (first[i] > second[i]) that[i] = first[i];
            else that[i] = second[i];
        }
        System.out.println(Arrays.toString(that));


    }
}
