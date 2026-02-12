/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  String playerName = null;
  int score = 0;

  /* your code here - constructor(s) */ 
  Scanner input = new Scanner(System.in);

  public Player ()
  {
    System.out.println("Please provide the player's name:");
    playerName = input.nextLine();
    score = 0;
    System.out.println("Welcome to PhraseSolver, " + playerName + "!");
  }

  public Player (String inputName)
  {
    playerName = inputName;
    score = 0;
    System.out.println("Welcome to PhraseSolver, " + playerName + "!");
  }
  
  /* your code here - accessor(s) */ 

  public int getScore(){
    return score;
  }

  /* your code here - mutator(s) */ 

  public void updateScore(int change){
    score += change;
  }

}