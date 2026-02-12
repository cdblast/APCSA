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
        System.out.println("Score: " + player.getScore() + "\nPhrase: " + board.getGuess());
        
        if(board.getGuess() == board.getPhrase()){
          correct = true;
          break;
        }


        System.out.println("Type your guess! (Provide either a letter or the entire phrase.):");

        String nextGuess = input.nextLine();
        int guessOutcome = board.interpretGuess(nextGuess);
        if(guessOutcome == 2){
          correct = true;
        }
        else if (guessOutcome == 1){
          player.updateScore(board.getLetterValue());
        }
      }
      
      /* your code here - determine how game ends */
      System.out.println("Congrats! The phrase was \"" + board.getPhrase() + "\"! You won the game with " + player.getScore() + " points!");
      solved = true; 
    } 
   
  }
  
}