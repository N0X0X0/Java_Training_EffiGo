import java.util.*;
public class hashset {
    public static void main(String arge[]){
        HashSet<Integer> st = new HashSet<>();
        st.add(5);
        st.add(10);
        st.add(25);
        st.add(50);
        System.out.println(st); 

        HashSet<ArrayList> set = new HashSet<>(); 
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(); 
        list1.add(1); 
        list1.add(2); 
        list2.add(9); 
        list2.add(10); 
        set.add(list1); 
        set.add(list2); 
        System.out.println(set); 

        HashSet<String> h = new HashSet<String>(); 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("USA"); 
        System.out.println(h); 
        System.out.println("Set contain India or not:"+ h.contains("India"));

        h.remove("Australia"); 
        System.out.println("List after removing Australia:"+ h); 

        Iterator<String> i = h.iterator();
        while (i.hasNext()){ 
            System.out.println(i.next()); 
        }
    }
}
