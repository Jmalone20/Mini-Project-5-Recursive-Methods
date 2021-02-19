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
    if (name.equals( names[i])) {
      System.out.println("Yay, we have you " + name + "!");
      return true;
    } else if (i < 4) {
      i++;
      return attendance(name, i);
    } else {
      return false;
    }
  }
}
