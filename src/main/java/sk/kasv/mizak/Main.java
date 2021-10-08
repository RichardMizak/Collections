package sk.kasv.mizak;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> items=new HashMap<>();
        items.put("A",1);
        items.put("B",2);
        items.put("C",3);
        items.put("D",4);
        items.put("E",5);
        for ( Map.Entry<String, Integer> stringIntegerMap: items.entrySet()) {
          //  System.out.println(stringIntegerMap);
        }

        items.forEach((key, value) -> System.out.println(key + " " + value));

        items.entrySet().stream().filter((temp)->temp.getValue()>1 && temp.getValue()<5)
                .forEach((temp) -> System.out.println(temp.getValue() + " " + temp.getKey()));

    }
}
