package homeworks;

import java.util.*;

public class Homework16 {
    public static void main(String[] args) {


        System.out.println("\n>>>--------------- TASK 1 ---------------<<<");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));


        System.out.println("\n>>>--------------- TASK 2 ---------------<<<");
        HashMap map1 = new HashMap<>();
        map1.put("Apple", 3);
        map1.put("Mango", 1);
        System.out.println(calculateTotalPrice1(map1));

        HashMap map2 = new HashMap<>();
        map2.put("Apple", 2);
        map2.put("Pineapple", 1);
        map2.put("Orange", 3);
        System.out.println(calculateTotalPrice1(map2));


        System.out.println("\n>>>--------------- TASK 3 ---------------<<<");
        HashMap map3 = new HashMap<>();
        map3.put("Apple", 3);
        map3.put("Mango", 5);
        System.out.println(calculateTotalPrice2(map3));

        HashMap map4 = new HashMap<>();
        map4.put("Apple", 4);
        map4.put("Mango", 8);
        map4.put("Orange", 3);
        System.out.println(calculateTotalPrice2(map4));


    }


    public static Map parseData(String str){
        TreeMap<Integer, String> map = new TreeMap<>();
        String[] strArray = str.split("\\W");
        for (int i = 1; i < strArray.length-1; i+=2) {
            map.put(Integer.parseInt(strArray[i]), strArray[i+1]);
        }
        return map;
    }


    public static double calculateTotalPrice1(Map<String, Integer> order){
        HashMap<String, Double> itemPrice = new HashMap<>();
        itemPrice.put("Apple", 2.00);
        itemPrice.put("Orange", 3.29);
        itemPrice.put("Mango", 4.99);
        itemPrice.put("Pineapple", 5.25);
        double totalPrice = 0;
        for (Map.Entry<String, Integer> element : order.entrySet()) {
            totalPrice += element.getValue() * itemPrice.get(element.getKey());
        }
        return totalPrice;
    }


    public static double calculateTotalPrice2(Map<String, Integer> order){
        HashMap<String, Double> itemPrice = new HashMap<>();
        itemPrice.put("Apple", 2.00);
        itemPrice.put("Orange", 3.29);
        itemPrice.put("Mango", 4.99);
        double totalPrice = 0;
        for (Map.Entry<String, Integer> element : order.entrySet()) {
            if (element.getKey().equals("Apple")) totalPrice += element.getValue() * itemPrice.get(element.getKey()) - element.getValue()/2;
            else if (element.getKey().equals("Mango")) totalPrice += (element.getValue() - (element.getValue()/4)) * itemPrice.get(element.getKey());
            else totalPrice += element.getValue() * itemPrice.get(element.getKey());
        }
        return totalPrice;
    }


}
