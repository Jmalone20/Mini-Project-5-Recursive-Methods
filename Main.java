import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // sacnner for user input
    Scanner scan = new Scanner(System.in);

  // asking for your name 
    System.out.println(" What is your name? ");
    String name = scan.next();

  // calling the attendance method
   boolean attendance1 = attendance(name, 0);

  // telling you if you are or aren't in the system with an if/else statement
  if (attendance1) {
    System.out.println("Yay, we have you " + name + "!");
  }else{
    System.out.println("Sorry, you are not in the system");
    }
  }

// new method for attendance with a boolean variable to test if it's true or not
  public static boolean attendance(String name, int i) {
    // an array with the list of names of the "roster"
    String[] names = { "Sam", "Jade", "Jasmine", "Lucy", "Cole" };
    // seeing if the name you type is equal to the name on the list
    if (name.equals(names[i])) {
      System.out.println("your name is " + name + " & the name you matched on is " + names[i]);
      return true;
    } else if (i < 4) {
      i++;
      return attendance(name, i);
      // if not its going to return false and it will print that you are ot in the system.
    } else {
      return false;
    }
  }
}

