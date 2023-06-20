package org.HomeWorks2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Homework5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(95287779, "Sergey");
        map.put(95287729, "Sergo");
        map.put(95287739, "Sergey");
        map.put(95287589, "Ivan");
        map.put(95247789, "Oleg");


        HashMap<String, Integer> map2 = new HashMap<>();

        for (Integer phoneNumber : map.keySet()) {
            String name = map.get(phoneNumber);
            map2.put(name, map2.getOrDefault(name, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>(map2.keySet());
        Collections.sort(list, (name1, name2) -> map2.get(name2) - map2.get(name1));

        for (String name : list) {
            int phoneCount = map2.get(name);
            System.out.println(name + ": " + phoneCount);
        }
    }
}
