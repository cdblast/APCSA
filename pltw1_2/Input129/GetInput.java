import java.util.Scanner;
/*
 * Activity 1.2.9
 */
public class GetInput
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a pet's name: ");
    String petName = sc.nextLine(); 
    System.out.println("Welcome, " + petName + "!");

    System.out.print("Enter " + petName + "'s age: ");
    double age = sc.nextDouble();
    System.out.println(petName + " is " + age + " year(s) old");

    System.out.print("Enter " + petName + "'s weight: ");
    int weight = sc.nextInt();
    System.out.println(petName + " weighs " + weight + " lbs");

    System.out.print("Is " + petName + " a new client? (true/false): ");
    boolean newClient = sc.nextBoolean();
    System.out.println(newClient);
    
    sc.close();
  }
}