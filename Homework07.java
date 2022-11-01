package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {


        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(10, 23, 67, 23, 78));
        // numbers1.add(10);
        // numbers1.add(23);
        // numbers1.add(67);
        // numbers1.add(23);
        // numbers1.add(78);
        System.out.println(numbers1.get(3));
        System.out.println(numbers1.get(0));
        System.out.println(numbers1.get(2));
        System.out.println(numbers1);



        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);



        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.add(23);
        numbers3.add(-34);
        numbers3.add(-56);
        numbers3.add(0);
        numbers3.add(89);
        numbers3.add(100);
        System.out.println(numbers3);
        Collections.sort(numbers3);
        System.out.println(numbers3);



        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);



        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        ArrayList<String> marvelCharacters = new ArrayList<>();
        marvelCharacters.add("Spider Man");
        marvelCharacters.add("Iron Man");
        marvelCharacters.add("Black Panther");
        marvelCharacters.add("Deadpool");
        marvelCharacters.add("Captain America");
        System.out.println(marvelCharacters);
        System.out.println(marvelCharacters.contains("Wolverine"));



        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");
        Collections.sort(avengers);
        System.out.println(avengers);
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));



        System.out.println("\n>>>--------------- TASK 7 ---------------<<<");
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');
        System.out.println(chars);
        for (Character c : chars) {
            System.out.println(c);
        }



        System.out.println("\n>>>--------------- TASK 8 ---------------<<<");
        ArrayList<String> objects = new ArrayList<>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);
        int countMm = 0;
        for (String object : objects) {
            if (object.toLowerCase().startsWith("m")) countMm++;
        }
        System.out.println(countMm);
        int countNoAaEe = objects.size();
        for (String object : objects) {
            if (object.toLowerCase().contains("a") || object.toLowerCase().contains("e")) countNoAaEe--;
        }
        System.out.println(countNoAaEe);



        System.out.println("\n>>>--------------- TASK 9 ---------------<<<");
        ArrayList<String> kObjects = new ArrayList<>();
        kObjects.add("Plate");
        kObjects.add("spoon");
        kObjects.add("fork");
        kObjects.add("Knife");
        kObjects.add("cup");
        kObjects.add("Mixer");
        System.out.println(kObjects);
        int countUpper = 0, countLower = 0, countHasPp = 0, countStartsEndsPp = 0;
        for (String element : kObjects) {
            if (element.charAt(0) >= 'A' && element.charAt(0) <= 'Z') countUpper++;
            else if (element.charAt(0) >= 'a' && element.charAt(0) <= 'z') countLower++;
            if (element.toLowerCase().contains("p")) countHasPp++;
            if (element.toLowerCase().startsWith("p") || element.toLowerCase().endsWith("p")) countStartsEndsPp++;
        }
        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements having P or p = " + countHasPp);
        System.out.println("Elements starting or ending with P or p = " + countStartsEndsPp);



        System.out.println("\n>>>--------------- TASK 10 ---------------<<<");
        ArrayList<Integer> numbers10 = new ArrayList<>();
        numbers10.add(3);
        numbers10.add(5);
        numbers10.add(7);
        numbers10.add(10);
        numbers10.add(0);
        numbers10.add(20);
        numbers10.add(17);
        numbers10.add(10);
        numbers10.add(23);
        numbers10.add(56);
        numbers10.add(78);
        System.out.println(numbers10);
        int countDividedBy10 = 0, countEvenGreater15 = 0, countOddLess20 = 0, countLess15More50 = 0;
        for (Integer n : numbers10) {
            if (n % 10 == 0) countDividedBy10++;
            if (n % 2 == 0 && n > 15) countEvenGreater15++;
            if (n % 2 == 1 && n < 20) countOddLess20++;
            if (n < 15 || n > 50) countLess15More50++;
        }
        System.out.println("Elements that can be divided by 10 = " + countDividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + countEvenGreater15);
        System.out.println("Elements that are odd and less than 20 = " + countOddLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + countLess15More50);


    }
}
