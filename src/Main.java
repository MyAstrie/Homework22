import homework1.*;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void task1(){
        String[] someFirstNames = {"Петр","Иван","Надя","Алексей"};
        String[] someSecondNames = {"Иванов","Петров","Фролов","Дудков"};
        TelephoneDirectory<String,Long> telephoneDirectory= new TelephoneDirectory<>();

        for(int i = 0; i < 20; i++){
            Random r = new Random();
            int index = r.nextInt(4);
            String fullName = someFirstNames[index];
            index = r.nextInt(4);
            fullName = fullName + " " + someSecondNames[index];
            long telephoneNumber = (long) ((Math.random() * (79999999999L - 70000000000L)) + 70000000000L);
            telephoneDirectory.put(fullName, telephoneNumber);
        }

        telephoneDirectory.forEach((k, v) -> System.out.println(k + " " +v));
    }

    public static void task3() {
        Map<String, Integer> map = new MyMap<>();
        map.put("str1", 2);
        map.put("str2", 1);
        map.put("str1", 5);

        map.forEach((k, v) -> System.out.println(k + " -> " +v));

        //map.put("str1", 5);
    }

    public static void randomListNumbers(List<Integer> list){
        var r = new Random();
        for (int i = 0; i < 3; i++){
            list.add(r.nextInt(1001));
        }
    }

    public static void homework2task1(){
        Map<String, List<Integer>> firstMap = new HashMap<>();
        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            randomListNumbers(tempList);
            firstMap.put(String.format("string%d", i), new ArrayList<>(tempList));
            tempList.clear();
        }
        firstMap.forEach((k, v) -> System.out.println(k + " -> " +v));

        Map<String, Integer> secondMap = new HashMap<>();
        for (var mapEntry : firstMap.entrySet()) {
            secondMap.put(mapEntry.getKey(), mapEntry.getValue().stream().mapToInt(Integer::intValue).sum());
        }
        secondMap.forEach((k, v) -> System.out.println(k + " -> " +v));
    }

    public static  void homework2task2() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "one");
        map.put(10, "two");
        map.put(2, "three");
        map.put(42222, "four");
        map.put(-2, "five");
        map.put(123, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");

        map.forEach((k, v) -> System.out.printf("%d -> %s \n", k, v));
    }

    public static void main(String[] args) {
        //task1();
        //task3();
        //homework2task1();
        //homework2task2();
    }
}