package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.OptionalInt;

import static java.util.Arrays.*;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        System.out.println(countWords("      Java is fun       "));
        System.out.println(countWords("Selenium is the most common UI automation tool.   "));
        System.out.println(countWords(""));


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        System.out.println(countA("TechGlobal is a QA bootcamp"));
        System.out.println(countA("QA stands for Quality Assurance"));
        System.out.println(countA(""));


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        System.out.println(countPos(new ArrayList<Integer>(Arrays.asList(-45, 0, 0, 34, 5, 67))));
        System.out.println(countPos(new ArrayList<Integer>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123))));


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        System.out.println(removeDuplicateNumbers(new ArrayList<Integer>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60))));
        System.out.println(removeDuplicateNumbers(new ArrayList<Integer>(Arrays.asList(1, 2, 5, 2, 3))));


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        System.out.println(removeDuplicateElements(new ArrayList<String>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"))));
        System.out.println(removeDuplicateElements(new ArrayList<String>(Arrays.asList("abc", "xyz", "123", "ab", "abc", "ABC"))));


        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        System.out.println(removeExtraSpaces("   I   am      learning     Java      "));
        System.out.println(removeExtraSpaces("Java  is fun    "));



        System.out.println("\n>>>--------------- TASK 7 ---------------<<<");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(sum(arr1, arr2)));
        int[] arr3 =  {10, 3, 6, 3, 2};
        int[] arr4 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        System.out.println(Arrays.toString(sum(arr3, arr4)));



        System.out.println("\n>>>--------------- TASK 8 ---------------<<<");
        System.out.println(findClosestTo10(new int[]{10, -13, 5, 70, 15, 57}));
        System.out.println(findClosestTo10(new int[]{10, -13, 12, 8, 15, -20}));



    }


    public static int countWords(String s){
        if (s.isEmpty()) return 0;
        else return (int) stream(s.trim().split(" ")).count();
    }


    public static int countA(String s){
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'a') countA++;
        }
        return countA;
    }



    public static int countPos(ArrayList<Integer> list){
        return (int) list.stream().filter(x -> x > 0).count();
    }



    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(list.get(i));
                    i--;
                }
            }
        }
        return list;
    }



    public static ArrayList<String> removeDuplicateElements(ArrayList<String> listS){
        ArrayList<String> uniques = new ArrayList<>();
        for (String element : listS) {
            if(!uniques.contains(element)) uniques.add(element);
        }
        return uniques;
    }


    public static String removeExtraSpaces(String s){
        return s.trim().replaceAll("\\s{1,}", " ");
    }


    public static int[] sum(int[] array1, int[] array2){
        int[] sum = new int[Math.max(array1.length, array2.length)];
        int[] longer;
        if (array1.length > array2.length) longer = array1;
        else longer = array2;
        for (int i = 0; i < sum.length; i++) {
            if (i < Math.min(array1.length, array2.length)) sum[i] = array1[i] + array2[i];
            else sum[i] = longer[i];
        }
        return sum;
    }



    public static int findClosestTo10(int[] arrayN){
        Arrays.sort(arrayN);
        int closestTo10 = Integer.MAX_VALUE;
        int leastDistance = Math.abs(10 - closestTo10);
        for (int i = 0; i < arrayN.length; i++) {
            int currentDistance = Math.abs(10 - arrayN[i]);
            if (currentDistance < leastDistance && currentDistance > 0) {
                closestTo10 = arrayN[i];
                leastDistance = currentDistance;
            }
        }
        return closestTo10;


    }








}
