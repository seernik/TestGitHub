package com.company.lesson16;

import java.util.*;


public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Puppet", new Toy("Puppet", 100.6778));
        map.put("Puppet1", new Toy("Puppet1", 100.758));
        map.put("Puppet2", new Toy("Puppet2", 100.675));
        map.put("Puppet3", new Toy("Puppet3", 100.0));
        map.put("Puppet4", new Toy("Puppet4", 100.0));
        map.put("Puppet5", new Toy("Puppet5", 100.0));

        SortedMap<String, Toy> sortedMap = new TreeMap<>(map);
        iterateByEntry(map);
        iterateByKey(map);
        iterateByValue(map);
        iterateByEntry(sortedMap);
        iterateByKey(sortedMap);
        iterateByValue(sortedMap);


    }

    public static void iterateByEntry(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> set = map.entrySet();
        for (Map.Entry < String, Toy > entry :set){
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());

        }
    }

    public static void iterateByKey(Map<String, Toy> map) {
        Set<String > keys = map.keySet();
        for (String key : keys) {
            System.out.print(key + " ");
            System.out.println(map.get(key));

        }
    }

    public static void iterateByValue(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        for (Toy toy : values) {
            System.out.println((toy));

        }
    }


}
