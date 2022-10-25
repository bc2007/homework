package homeworks;

import utilities.ScannerHelper;

public class Homework04 {
    public static void main(String[] args) {


        System.out.println(">>>--------------- TASK 1 ---------------<<<");
        String name = ScannerHelper.getAName();
        System.out.println("The length of the name is = " + name.trim().length());
        System.out.println("The first character in the name is = " + name.trim().charAt(0));
        System.out.println("The last character in the name is = " + name.trim().charAt(name.trim().length()-1));
        System.out.println("The first 3 characters in the name are = " + name.trim().substring(0, 3));
        System.out.println("The last 3 characters in the name are = " + name.trim().substring(name.trim().length()-3));
        if (name.trim().startsWith("A") || name.trim().startsWith("a")) {
            System.out.println("You are in the club!");
        } else {
            System.out.println("Sorry, you are not in the club");
        }


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        String address = ScannerHelper.getAnAddress();
        if (address.toLowerCase().contains("chicago")) {
            System.out.println("You are in the club");
        } else if (address.toLowerCase().contains("des plaines")) {
            System.out.println("You are welcome to join to the club");
        } else {
            System.out.println("Sorry, you will never be in the club");
        }


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        String favColors = ScannerHelper.getUserFavColors();
        if (isRed(favColors) && isGreen(favColors)) {
            System.out.println("Green and red are in the list");
        } else if (isGreen(favColors)) {
            System.out.println("Green is in the list");
        } else if (isRed(favColors)) {
            System.out.println("Red is in the list");
        } else {
            System.out.println("Green and red are not in the list");
        }


        System.out.println("\n>>>--------------- TASK 4 ---------------<<<");
        String str = "   Java is FUN   ";
        str = str.trim().toLowerCase();
        String str1 = str.substring(0, str.indexOf(" "));
        String str2 = str.substring(str.indexOf(" ")+1, str.lastIndexOf(" "));
        String str3 = str.substring(str.lastIndexOf(" ")+1, str.length());
        System.out.println("The first word in the str is = " + str1);
        System.out.println("The second word in the str is = " + str2);
        System.out.println("The third word in the str is = " + str3);


    }   //   end of the main method

    public static boolean isRed(String colors) {
        return (colors.toLowerCase().contains("red"));
    }

    public static boolean isGreen(String colors) {
        return (colors.toLowerCase().contains("green"));
    }


}   //   end of the class Homework04