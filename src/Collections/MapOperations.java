package Collections;

import java.util.HashMap;

public class MapOperations {
    public static void main(String args[]){

        HashMap<Integer, String> map= new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4,"four");
        System.out.println(map);
        HashMap<Integer, String> map2= new HashMap<Integer, String>();
        map2.put(1, "One");
        map2.put(2, "Two");
        map2.put(3, "Three");
        map2.put(4,"four");
        System.out.println(map2);
        boolean equals=map.equals(map2);
        System.out.println(equals);
        map.get(2);
        System.out.println("Value for key 2: " + map.get(2));
        boolean containskey=map.containsKey(3);
        System.out.println("Contains key 3: " + containskey);
        boolean containsvalue=map.containsValue("One");
        System.out.println("Contains value 'One': " + containsvalue);
        map.remove(1);
        System.out.println("After removing key 1: " + map);
        map.keySet();
        System.out.println("Keys in the map: " + map.keySet());
        map.values();
        System.out.println("Values in the map: " + map.values());
        map.entrySet();
        System.out.println("Entries in the map: " + map.entrySet());
        boolean isEmpty = map.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);
        int size = map.size();
        System.out.println("Size of the map: " + size);
        map.putAll(map2);
        System.out.println("After adding all entries from map2: " + map);
        map.replace(2, "Two Updated");
        System.out.println("After replacing value for key 2: " + map);
        map.replace(3, "Three", "Three Updated");
        System.out.println("After replacing value for key 3: " + map);

        for(HashMap.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

        }
        System.out.println("Iterating using forEach:");
        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });



    }
}
