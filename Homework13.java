package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Homework13 {
    public static void main(String[] args) {


        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("125$"));
        System.out.println(hasLowerCase("hello"));


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        System.out.println(noZero(new ArrayList<>(Arrays.asList(1))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(1, 1, 10))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(0, 1, 10))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(0, 0, 0))));


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 2, 3})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{0, 3, 6})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 4})));


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        System.out.println(containsValue(new String[]{"abc", "foo", "java"}, "hello"));
        System.out.println(containsValue(new String[]{"abc", "def", "123"}, "Abc"));
        System.out.println(containsValue(new String[]{"abc", "def", "123", "Java", "Hello"}, "123"));


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));


        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));


        System.out.println("\n>>>--------------- TASK 7 ---------------<<<");
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "###"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"})));


        System.out.println("\n>>>--------------- TASK 8 ---------------<<<");
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")), new ArrayList<>(Arrays.asList("abc", "xyz", "123"))));
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")), new ArrayList<>(Arrays.asList("Java", "C#", "Python"))));
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "C#", "C#")), new ArrayList<>(Arrays.asList("Python", "C#", "C++"))));


        System.out.println("\n>>>--------------- TASK 9 ---------------<<<");
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("abc", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyz", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("x", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyXyxy", "Xx", "ABC"))));




    }


        public static boolean hasLowerCase(String string1){
            return string1.matches("[a-z]{1,}");
        }


        public static ArrayList noZero(ArrayList<Integer> numbers){
            numbers.removeIf(o -> o.equals(0));
            return numbers;
        }


        public static int[][] numberAndSquare(int[] array1){
            int[][] newArray = new int[array1.length][2];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < 2; j++) {
                    if (j == 0) newArray[i][j] = array1[i];
                    else newArray[i][j] = array1[i] * array1[i];
                }
            }
            return newArray;
        }


        public static boolean containsValue(String[] sArray, String string4){
            Arrays.sort(sArray);
            int value = Arrays.binarySearch(sArray, string4);
            if (value >= 0) return true;
            return false;
        }


        public static String reverseSentence(String string5){
            String[] sArray5 = string5.toLowerCase().split(" ");
            if (sArray5.length <= 1) return "There is not enough words!";
            StringBuilder stringBuilder = new StringBuilder("");
            for (int i = sArray5.length - 1; i >= 0; i--) {
                stringBuilder.append(sArray5[i] + " ");
            }
            string5 = stringBuilder.toString().trim();
            return string5.substring(0, 1).toUpperCase() + string5.substring(1);
        }


        public static String removeStringSpecialsDigits(String string6){
            return string6.replaceAll("[^a-zA-Z ]{1,}", "");
        }


        public static String[] removeArraySpecialsDigits(String[] sArray7){
            for (int i = 0; i < sArray7.length; i++) {
                sArray7[i] = sArray7[i].replaceAll("[^a-zA-Z ]{1,}", "");
            }
            return sArray7;
        }


        public static ArrayList removeAndReturnCommons(ArrayList<String> listA, ArrayList<String> listB){
            ArrayList<String> resultList = new ArrayList<>();
            for (int i = 0; i < listA.size(); i++) {
                for (int j = 0; j < listB.size(); j++) {
                    if (listA.get(i).equals(listB.get(j)) && !resultList.contains(listA.get(i))) resultList.add(listA.get(i));
                }
            }
            return resultList;
        }


        public static ArrayList noXInVariables(ArrayList<String> list9){
            for (int i = 0; i < list9.size(); i++) {
                list9.set(i, list9.get(i).replaceAll("[xX]{1,}", ""));
                if (list9.get(i).isEmpty()) list9.remove(list9.get(i));
            }
            return list9;
        }



}
