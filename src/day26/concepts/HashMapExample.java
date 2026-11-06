package day26.concepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        hashMap.put(103, "Neha");
        hashMap.put(101, "Rahul");
        hashMap.put(102, "Amit");

        linkedHashMap.put(103, "Neha");
        linkedHashMap.put(101, "Rahul");
        linkedHashMap.put(102, "Amit");

        treeMap.put(103, "Neha");
        treeMap.put(101, "Rahul");
        treeMap.put(102, "Amit");

        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("TreeMap: " + treeMap);
    }
}
