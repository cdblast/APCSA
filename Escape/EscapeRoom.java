/*
* Problem 1: Escape Room
* 
* V1.0
* 10/10/2019
* Copyright(c) 2019 PLTW to present. All rights reserved
*/
import java.util.Scanner;

/**
 * Create an escape room game where the player must navigate
 * to the other side of the screen in the fewest steps, while
 * avoiding obstacles and collecting prizes.
 */
public class EscapeRoom
{

      // describe the game with brief welcome message
      // determine the size (length and width) a player must move to stay within the grid markings
      // Allow game commands:
      //    right, left, up, down: if you try to go off grid or bump into wall, score decreases
      //    jump over 1 space: you cannot jump over walls
      //    if you land on a trap, spring a trap to increase score: you must first check if there is a trap, if none exists, penalty
      //    pick up prize: score increases, if there is no prize, penalty
      //    help: display all possible commands
      //    end: reach the far right wall, score increase, game ends, if game ended without reaching far right wall, penalty
      //    replay: shows number of player steps and resets the board, you or another player can play the same board
      // Note that you must adjust the score with any method that returns a score
      // Optional: create a custom image for your player use the file player.png on disk
    
      /**** provided code:
      // set up the game
      boolean play = true;
      while (play)
      {
        // get user input and call game methods to play 
        play = false;
      }
      */

  public static void main(String[] args) 
  {      
    // welcome message
    System.out.println("Welcome to EscapeRoom!");
    System.out.println("Get to the other side of the room, avoiding walls and invisible traps,");
    System.out.println("pick up all the prizes.\n");
    
    GameGUI game = new GameGUI();
    game.createBoard();

    // size of move
    int m = 60; 
    // individual player moves
    int px = 0; // track player's column (0..7)
    int py = 0; 
    
    int score = 0;

    Scanner in = new Scanner(System.in);
    String[] validCommands = { "right", "left", "up", "down", "r", "l", "u", "d",
    "jump", "jr", "jumpleft", "jl", "jumpup", "ju", "jumpdown", "jd",
    "pickup", "p", "quit", "q", "replay", "restart", "help", "?"};
  
    // set up game
    boolean play = true;
    boolean ended = false; // tracks whether endGame() has already been called
    System.out.println("Type 'help' or '?' for a list of commands.");
    while (play)
    {
      /* Read raw input so we can penalize invalid commands */
      String input = "";
      boolean valid = false;
      do {
        System.out.print("> ");
        input = in.nextLine().trim();
        for (String cmd : validCommands)
        {
          if (input.equalsIgnoreCase(cmd)) { valid = true; break; }
        }
        if (!valid)
        {
          System.out.println("Invalid input. Please try again");
          score -= 1; // penalty for invalid command
          System.out.println("Score: " + score);
        }
      } while(!valid);

      // every valid command increases the score by 1
      score += 1;
      if (input.equalsIgnoreCase("right") || input.equalsIgnoreCase("r"))
      {
        if (game.isTrap(m,0))
        {
          // sprung traps decrease the score
          score -= game.springTrap(m,0);
        }
        int res = game.movePlayer(m,0);
        score += res;
        // if move succeeded (non-negative return), update column
        if (res >= 0) {
          px += 1;
          // if we've reached rightmost column (column index 7), end game
          if (px >= 7) {
            // ensure GUI updates player location before endGame checks it
            game.repaint();
            try { Thread.sleep(120); } catch (InterruptedException ie) { }
            int endScore = game.endGame();
            score += endScore;
            if (endScore > 0) {
              System.out.println("Congratulations! You have reached the end of the game.");
              System.out.println("Your final score is: " + score);
            } else {
              System.out.println("Game ended.");
              System.out.println("score=" + score);
            }
            System.out.println("steps=" + game.getSteps());
            play = false;
            ended = true;
            break;
          }
        }
      }
      if (input.equalsIgnoreCase("left") || input.equalsIgnoreCase("l"))
      {
        if (game.isTrap(-m,0))
        {
          score -= game.springTrap(-m,0);
        }
        int res = game.movePlayer(-m,0);
        score += res;
        if (res >= 0) {
          px = Math.max(0, px - 1);
        }
      }
      if (input.equalsIgnoreCase("up") || input.equalsIgnoreCase("u"))
      {
        if (game.isTrap(0,-m))
        {
          score -= game.springTrap(0,-m);
        }
        int res = game.movePlayer(0,-m);
        score += res;
        // up/down do not change column
      }
      if (input.equalsIgnoreCase("down") || input.equalsIgnoreCase("d"))
      {
        if (game.isTrap(0,m))
        {
          score -= game.springTrap(0,m);
        }
        int res = game.movePlayer(0,m);
        score += res;
        // up/down do not change column
      }
      if (input.equalsIgnoreCase("jump") || input.equalsIgnoreCase("jr"))
      {
        if (game.isTrap(2*m,0))
        {
          score -= game.springTrap(2*m,0);
        }
        int res = game.movePlayer(2*m,0);
        score += res;
        if (res >= 0) {
          px += 2;
          if (px >= 7) {
            // ensure GUI updates player location before endGame checks it
            game.repaint();
            try { Thread.sleep(120); } catch (InterruptedException ie) { }
            int endScore = game.endGame();
            score += endScore;
            if (endScore > 0) {
              System.out.println("Congratulations! You have reached the end of the game.");
              System.out.println("Your final score is: " + score);
            } else {
              System.out.println("Game ended.");
              System.out.println("score=" + score);
            }
            System.out.println("steps=" + game.getSteps());
            play = false;
            ended = true;
            break;
          }
        }
      }
      if (input.equalsIgnoreCase("jumpleft") || input.equalsIgnoreCase("jl"))
      {
        if (game.isTrap(2*-m,0))
        {
          score -= game.springTrap(2*-m,0);
        }
        int res = game.movePlayer(2*-m,0);
        score += res;
        if (res >= 0) {
          px = Math.max(0, px - 2);
        }
      }
      if (input.equalsIgnoreCase("jumpup") || input.equalsIgnoreCase("ju"))
      {
        if (game.isTrap(0,2*-m))
        {
          score -= game.springTrap(0,2*-m);
        }
        int res = game.movePlayer(0,2*-m);
        score += res;
        // up/down do not change column
      }
      if (input.equalsIgnoreCase("jumpdown") || input.equalsIgnoreCase("jd"))
      {
        if (game.isTrap(0,2*m))
        {
          score -= game.springTrap(0,2*m);
        }
        int res = game.movePlayer(0,2*m);
        score += res;
        // up/down do not change column
      }
      if (input.equalsIgnoreCase("pickup") || input.equalsIgnoreCase("p"))
      {
        score += game.pickupPrize();
      }
      if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("q"))
      {
        play = false;
      }
      if (input.equalsIgnoreCase("replay"))
      {
        System.out.println("Steps taken: " + game.getSteps());
        score += game.replay();
      }
      if (input.equalsIgnoreCase("restart"))
      {
        // If game already ended (frame disposed), create a fresh GameGUI; otherwise just replay
        if (ended)
        {
          game = new GameGUI();
          game.createBoard();
          ended = false;
        }
        else
        {
          game.replay();
        }
        score = 0;
        px = 0;
        System.out.println("Game restarted. Score reset to 0.");
      }
      if (input.equalsIgnoreCase("help") || input.equalsIgnoreCase("?")){
        System.out.println("Commands you can use are:");
        System.out.println("right, r, left, l, up, u, down, d, jump, jr, jumpleft, jl, jumpup, ju, jumpdown, jd, pickup, p, quit, q, replay");
      }
    } 

  

    if (!ended) 
    {
      score += game.endGame();
    }

    System.out.println("score=" + score);
    System.out.println("steps=" + game.getSteps());
  }
}

        