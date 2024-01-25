import java.util.Scanner;

class Main {

    public static void main(String[] args) {
      Scanner myobj= new Scanner(System.in);
      System.out.println("Enter name");
      String temp=myobj.nextLine();
      System.out.println("Enter age");
      int num=myobj.nextInt();
      System.out.println(temp + " " + num);
    }
}
  
  