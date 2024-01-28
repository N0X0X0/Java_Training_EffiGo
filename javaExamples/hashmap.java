import java.util.*;
public class hashmap {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);
        if(map.containsKey("China")) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
        if(map.containsKey("Indonesia")) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
        System.out.println(map.get("China")); 
        System.out.println(map.get("Indonesia")); 

        for( Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey());
            System.out.println(" " + e.getValue());
        }
            
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+ " " + map.get(key));
        }
    }
}
