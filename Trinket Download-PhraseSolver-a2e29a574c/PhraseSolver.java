/*
 * Activity 2.2.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  Player player = new Player();
  Board board = new Board();

  /* your code here - constructor(s) */ 
  
  public PhraseSolver ()
  {
    
  }

  public void play()
  {
    boolean solved = false;

    Scanner input = new Scanner(System.in);
    
    boolean correct = false;
    while (!solved) 
    {
      while (!correct){
        if(board.getGuess() == board.getPhrase()){
          correct = true;
        }
        System.out.println("Score: " + player.getScore() + "\nPhrase: " + board.getGuess());
        System.out.println("Type your guess! (Provide either a letter or the entire phrase.):");
        String nextGuess = input.nextLine();
        if(board.interpretGuess(nextGuess) == 2){
          correct = true;
        }
      }
      
      System.out.println("Congrats! The phrase was \"" + board.getPhrase() + "\"! You won the game with " + player.getScore() + " points!");
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}