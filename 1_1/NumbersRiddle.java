/*
 * 1.1.6 Numbers Riddle project
 */

import java.util.Scanner;

public class NumbersRiddle {
    public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Provide an integer: ");
    double userInput = input.nextDouble();
    //System.out.println(userInput);

    /*
     * "Choose any integer, 
     * double it, 
     * add 6, 
     * divide it in half, 
     * and subtract the number you started with. The answer is always 3!"
     */
    /*
    int riddleProcess = (int)userInput*2;
    System.out.print(userInput + " * 2 = ");
    System.out.println(riddleProcess);
    System.out.print(riddleProcess + " + 6 = ");
    System.out.println(riddleProcess+6);
    riddleProcess += 6;
    System.out.print(riddleProcess + " / 2 = ");
    System.out.println(riddleProcess/2);
    riddleProcess /= 2;
    System.out.print(riddleProcess + " - " + userInput + " = ");
    System.out.println(riddleProcess-userInput);
    riddleProcess -= userInput;
    System.out.println();
    */
    double riddleProcess = userInput*2;
    System.out.print(userInput + " * 2 = ");
    System.out.println(riddleProcess);
    System.out.print(riddleProcess + " + 6 = ");
    System.out.println(riddleProcess+6);
    riddleProcess += 6;
    System.out.print(riddleProcess + " / 2 = ");
    System.out.println(riddleProcess/2);
    riddleProcess /= 2;
    System.out.print(riddleProcess + " - " + userInput + " = ");
    System.out.println(riddleProcess-userInput);
    riddleProcess -= userInput;
    System.out.println();

  }
}
