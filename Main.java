import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println(" What is your name? ");
    String name = scan.next();

    attendance(name, 0);
  }

  public static boolean attendance(String name, int i) {
    String[] names = { "Sam", "Jade", "Jasmine", "Lucy", "Cole" };
    if (name == names[i]) {
      return true;
    } else if (i < 10) {
      return attendance(name, i);
    }else{
      return false;
    }
  }
}
