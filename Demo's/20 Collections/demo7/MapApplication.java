package org.rastalion.chapter20_collections.demo7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapApplication {
    public static void main (String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        //This map will mostly
        //sort in natural order
        //but not always!!
       // testMap(hashMap);

        //This will store the data as
        //you have added it to the map.
        //testMap(linkedHashMap);

        //Uses natural order
       // testMap(treeMap);
    }

    private static void testMap (Map<Integer, String> map) {

        map.put(9,"fox");
        map.put(0,"cat");
        map.put(2,"dog");
        map.put(1,"giraffe");
        map.put(10,"monkey");
        map.put(6,"snake");

        for (Integer key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }

}
