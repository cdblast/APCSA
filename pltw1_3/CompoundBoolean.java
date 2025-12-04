/*
 * Activity 1.3.5
 */
import java.util.Scanner;

public class CompoundBoolean
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in); 
    //Collect three integer values from the user
    System.out.println("Enter the first number (a)");
    int a = sc.nextInt(); 
    System.out.println("Enter the second number (b)");
    int b = sc.nextInt(); 
    System.out.println("Enter the third number (c)");
    int c = sc.nextInt(); 
    //Create if statements for the compound Boolean expressions in your truth table.
    //Use your own words to describe the result of each compound expression as the output of your program.
    if (a > b){
        System.out.println("(" + a + " > " + b + ") returns true! " + a + " is greater than " + b + ".");
    }
    if (b > c){
        System.out.println("("+ b + " > " + c + ") returns true! " + b + " is greater than " + c + ".");
    }
    if ((a > b)&&(b > c)){
        System.out.println("(" + a + " > " + b + ")&&(" + b + " > " + c + ") returns true! " + a + " is greater than " + b + " AND " + b + " is greater than " + c + ". ");
    }
    if ((a > b)||(b > c)){
        System.out.println("(" + a + " > " + b + ")||(" + b + " > " + c + ") returns true! Either " + a + " is greater than " + b + ", OR " + b + " is greater than " + c + ". ");
    }
    if (!((a > b)&&(b > c))){
        System.out.println("!(" + a + " > " + b + ")&&(" + b + " > " + c + ") returns true! This means that (" + a + " > " + b + ")&&(" + b + " > " + c + ") returned false, which returned true with the ! (NOT) operator");
    }// All of PLTW provided expressions
    if ((b >= c) && (a == c)){
        System.out.println("(" + b + " >= " + c + ")&&(" + a + " == " + c + ") returns true! This means that " + b + " is greater than or equal to " + c + ", AND that " + a + " and " + c + " are equal to eachother.");
    }
    if (!(c > b)){
        System.out.println("!(" + c + " > " + b + ") returns true! This means that " + c + " is NOT bigger than " + b + ". ");
    }

    // close Scanner when done
    sc.close();
  }
}
