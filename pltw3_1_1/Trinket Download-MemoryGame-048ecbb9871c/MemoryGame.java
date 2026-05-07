import java.util.Arrays;

/**
 * Project 3.1.5
 *
 * The Memory Game shows a random sequence of "memory strings" in a variety of buttons.
 * After wathcing the memory strings appear in the buttons one at a time, the
 * player recreates the sequence from memory.
 */
public class MemoryGame
{
  public static void main(String[] args) {

    // TO DO: Create the "memory strings" - an array of at least 4 single character  
    // strings to show in the buttons, one element at a time. This is the sequence
    // the player will have to remember.
    String[] memoryStrings = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    int rounds = 0;
    int score = 0;

    // Create the game and gameboard. Configure a randomized board with 3 buttons.
    // (Later, you can change options to configure more or less buttons
    // and turn randomization on or off.))
    MemoryGameGUI game = new MemoryGameGUI();
    game.createBoard(3, true);

    boolean isPlaying = true;
    // TO DO: Play the game until user wants to quit.
    while(isPlaying){
        rounds++; //Adding to the rounds counter
        boolean matched = false; 
        int matchScore = 0;
        // TO DO: Call the next method in RandomPermutation to create a random version 
        // of the "memory strings"
        String[] randomSeq = new String[4];
        for (int i = 0; i < 4; i++){
          int rand = (int)(Math.random()*25);
          randomSeq[i] = memoryStrings[rand];
          System.out.println(i + " is at " + rand + ", which is " + randomSeq[i]);
        }
        
        // TO DO: Play one sequence with a .5 second delay. Save the player's guess. 
        // (Later, you can speed up or slow down the game.)
        String guess = game.playSequence(randomSeq, 0.5); //og delay is .5
        String cleanedGuess = "";

        // TO DO: If the guess is not null, determine a match
            if (guess != null){
            // TO DO: Cleanup the guess - replace commas and spaces with the empty string.
            // Refer to a new String method replace.
            cleanedGuess = guess.replace(" ","");
            guess = cleanedGuess;
            cleanedGuess = guess.replace(",","");
            cleanedGuess = cleanedGuess.toUpperCase();
            
            String[] cleanedArr = cleanedGuess.split("");
            // TO DO: Iterate to determine if all elements of the guess match sequence
            System.out.println(cleanedArr.length + ", " + randomSeq.length);
              if(cleanedArr.length == randomSeq.length){
                for(int i = 0; i < 4; i++){
                  System.out.println(cleanedArr[i] + randomSeq[i]);
                  if(cleanedArr[i].equals(randomSeq[i])){
                    matchScore++;
                  }
                }
              }
            
            }
            if(matchScore == 4){
              matched = true;
            }

            // If match, signal a match, otherwise, try again.
            if (matched)
            {
              game.matched();
              // increase score
              score++;
             }
            else
            {
              game.tryAgain();
            }
            
  
        // TO DO: Ask if user wants to play another round of the game 
        isPlaying = game.playAgain();
    }
   
    // When done playing, show score and end the game.
    game.showScore(score, rounds);
    game.quit();
  }
}