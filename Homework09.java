package homeworks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Homework09 {
    public static void main(String[] args) {


        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        int duplicate = numbers[0];
        boolean foundDuplicate = false;
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicate = numbers[i];
                    foundDuplicate = true;
                    break;
                }
            }
            if (foundDuplicate) break;
        }
        if (foundDuplicate) System.out.println(duplicate);
        else System.out.println("There are no duplicates");


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        String[] words = {"a", "b", "B", "XYZ", "123"};
        String duplicateS = words[0];
        boolean foundDuplicateS = false;
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    duplicateS = words[i];
                    foundDuplicateS = true;
                    break;
                }
            }
            if (foundDuplicateS) break;
        }
        if (foundDuplicateS) System.out.println(duplicateS);
        else System.out.println("There are no duplicates");


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        int[] nums = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j] && !duplicates.contains(nums[i])) {
                    duplicates.add(nums[i]);
                    break;
                }
            }
        }
        if (duplicates.isEmpty()) System.out.println("There are no duplicates");
        else duplicates.forEach(System.out::println);


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        String[] words2 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        ArrayList<String> duplicates2 = new ArrayList<>();
        for (int i = 0; i < words2.length-1; i++) {
            for (int j = i+1; j < words2.length; j++) {
                if (words2[i].equalsIgnoreCase(words2[j]) && !duplicates2.stream().anyMatch(words2[i] :: equalsIgnoreCase)) {
                    duplicates2.add(words2[i]);
                    break;
                }
            }
        }
        if (duplicates2.isEmpty()) System.out.println("There are no duplicates");
        else duplicates2.forEach(System.out::println);


        System.out.println("\n>>>--------------- TASK 5 ---------------<<<");
        String[] words5 = {"abc", "foo", "bar"};
        ArrayList<String> list5 = new ArrayList<>();
        for (int i = words5.length-1; i >= 0; i--) {
            list5.add(words5[i]);
        }
        System.out.println(list5);


        System.out.println("\n>>>--------------- TASK 6 ---------------<<<");
        String str = "Java is fun";
        ArrayList<String> breakS = new ArrayList<>(Arrays.asList(str.split(" ")));
        for (int i = 0; i < breakS.size(); i++) {
            breakS.set(i, String.valueOf(new StringBuilder(breakS.get(i)).reverse()));
        }
        for (int i = 0; i < breakS.size(); i++) {
            if (i < breakS.size()-1) System.out.print(breakS.get(i) + " ");
            else System.out.println(breakS.get(i));
        }


    }
}
