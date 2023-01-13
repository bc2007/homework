package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Homework15 {
    public static void main(String[] args) {


        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        System.out.println(Arrays.toString(fibonacciSeries1(3)));
        System.out.println(Arrays.toString(fibonacciSeries1(5)));
        System.out.println(Arrays.toString(fibonacciSeries1(7)));


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(8));


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{})));
        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})));
        System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
        System.out.println(Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf3(3));
        System.out.println(isPowerOf3(81));


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        System.out.println(firstDuplicate(new int[]{}));
        System.out.println(firstDuplicate(new int[]{1}));
        System.out.println(firstDuplicate(new int[]{1, 2, 2, 3}));
        System.out.println(firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));


    }


    public static int[] fibonacciSeries1(int n){
        int[] arrayF = new int[n];
        arrayF[0] = 0;
        arrayF[1] = 1;
        for (int i = 2; i < n; i++) {
            arrayF[i] = arrayF[i-2] + arrayF[i-1];
        }
        return arrayF;
    }


    public static int fibonacciSeries2(int n){
        int[] arrayF = new int[n];
        arrayF[0] = 0;
        arrayF[1] = 1;
        for (int i = 2; i < n; i++) {
            arrayF[i] = arrayF[i-2] + arrayF[i-1];
        }
        return arrayF[n-1];
    }


    public static int[] findUniques(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int element : a) {
            listA.add(element);
        }
        for (int element : b) {
            listB.add(element);
        }
        for (int i = 0; i < listA.size(); i++) {
            if (!list.contains(listA.get(i)) && !listB.contains(listA.get(i))) list.add(listA.get(i));
        }
        for (int i = 0; i < listB.size(); i++) {
            if (!list.contains(listB.get(i)) && !listA.contains(listB.get(i))) list.add(listB.get(i));
        }
        int[] uniques = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniques[i] = list.get(i);
        }
        return uniques;
    }


    public static boolean isPowerOf3(int num){
        boolean flag = false;
        for (int i = 0; i <= num; i++) {
            if (Math.pow(3, i) == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    public static int firstDuplicate(int[] numbers){
        if (numbers.length <= 1) return -1;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) map.put(j, numbers[j]);
            }
        }
        return map.firstKey();
    }


}
