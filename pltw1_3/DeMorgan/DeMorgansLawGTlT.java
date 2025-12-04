/*
 * Activity 1.3.6
 */
import java.util.Scanner; 

public class DeMorgansLawGTlT
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number for X");
    int x = sc.nextInt();

    System.out.println("Enter a number for Y");
    int y = sc.nextInt(); 
    
    System.out.println("Checking that both x and y are not negative ... ");
    if (!(x < 0) && !(y < 0)) {
      System.out.println("Both x and y are not negative");
    }
    
    /* your code here */ 
    if((x < 0) || (y < 0) || !(x < 0) || !(y < 0)) {
      System.out.println("X or Y were either negative or positive.");
    }
    //short-circuit evaluation could have occured at any point since this tests all possibilities
  }
}