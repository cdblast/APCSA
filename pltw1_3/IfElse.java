/*
 * Activity 1.3.3
 */
import java.util.Scanner;

public class IfElse 
{
  public static void main(String[] args) 
  {
    // A scanner to get user input.
    Scanner sc = new Scanner(System.in); 
    
    System.out.println("Enter name");
    String name = sc.nextLine(); 

    System.out.println("Enter the number");
    int grade = sc.nextInt();
    
    /* Your code here. */
 //Take the following code and modify it so that if the numeric input is greater than 90, it prints “[Name] received an A.”
    if (grade > 90){
      System.out.println(name + " received an A.");
    }
 
    // close Scanner when done
    sc.close();
  }
}



