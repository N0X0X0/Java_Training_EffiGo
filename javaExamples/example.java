import java.util.*;

class Main {

    static class Pair{
      int a;
      int b;
      Pair(int a, int b){
        this.a = a;
        this.b = b;
      }
    }

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      // String s1 = sc.next();

      // String s2 = "ayush";
      // String s3 = "ayush";

      // if(s1 == s2){
      //   System.out.println("==");
      // }

      // if(s3 == s2){
      //   System.out.println("this will work");
      // }

      // if(s1.equals(s2)){
      //   System.out.println("equals()");
      // }

      ///////////////
      Set<Integer> set = new HashSet<>();

      set.add(1);
      set.add(1);
      set.add(3);
      set.add(4);
      set.add(4);
      set.add(10);

      System.out.println(set);
      System.out.println("-----------------------");


      Set<Pair> pairSet = new HashSet<>();

      pairSet.add(new Pair(2, 3));
      pairSet.add(new Pair(2, 3));
      pairSet.add(new Pair(4, 3));

      Pair something = new Pair(7, 8);
      pairSet.add(something);
      pairSet.add(something);

      for(Pair p: pairSet){
        System.out.println(p.a + "  " + p.b);
      }
      System.out.println(pairSet);
    }
}
  
  
