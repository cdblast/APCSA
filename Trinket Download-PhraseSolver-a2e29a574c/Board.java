/*
 * Activity 2.2.2
 *
 * A Board class the PhraseSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class  Board
{
  private String solvedPhrase = "";
  private String phrase = "";
  private int currentLetterValue = 0; 

  /* your code here - constructor(s) */ 
    public Board ()
  {
    setLetterValue();
    solvedPhrase = loadPhrase();
    concealPhrase();
    System.out.println("Solved Phrase: " + solvedPhrase); //temp test code
  }

  /* your code here - accessor(s) */
  public String getGuess(){
    return phrase;
  }
  public String getPhrase(){
    return solvedPhrase;
  }
  public int getLetterValue(){
    return currentLetterValue;
  }

  /* your code here - mutator(s)  */
  private void concealPhrase(){
    for (int i = 0; i < solvedPhrase.length(); i++)
    {
      if (solvedPhrase.substring(i, i + 1).equals(" "))
      {
        phrase += " ";
      }
      else
      {
        phrase += "_";
      }
    }
  }

  private void revealPhraseByLetter(String letter){
    String newPhrase = phrase;
    for (int i = 0; i < solvedPhrase.length(); i++)
    {
      if (solvedPhrase.substring(i, i + 1).equals(letter))
      {
        newPhrase = phrase.substring(0, i) + letter + phrase.substring(i + 1, phrase.length());
        phrase = newPhrase;
      }
    }
    phrase = newPhrase;
  }

  public int interpretGuess(String toInterpret){//Returns 0 for false, 1 for letter solve and 2 for phrase solve
    int length = toInterpret.length();
    setLetterValue();

    if (length == 1){
      boolean isCorrect = guessLetter(toInterpret);
      //System.out.println("interpreting as letter");
/*
          for (int i = 0; i < phrase.length(); i++)
          {
            System.out.println(phrase.substring(i, i+1) + " compared to " + toInterpret);
          if (phrase.substring(i, i + 1).equals(toInterpret))
            {
              isCorrect = true;
            }
          }*/

      if (isCorrect){
        //System.out.println("letter correct");
        //revealPhraseByLetter(toInterpret);
        return 1;
      }
    }
    else if(length == phrase.length()){
      if (toInterpret.equals(solvedPhrase)){
        phrase = solvedPhrase;
        return 2;
      }
    }
    else{
      System.out.println("That guess could not be interpreted as a singular letter or as a whole-phrase guess. Please try again!");
    }
    return 0;
  }

  /* ---------- provided code, do not modify ---------- */
  public void setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;    
    currentLetterValue = randomInt;
  }

  public boolean isSolved(String guess)
  {
    if (phrase.equals(guess))
    {
      return true;
    }
    return false;
  }

  private String loadPhrase()
  {
    String tempPhrase = "";
    
    int numOfLines = 0;
    try 
    {
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
    for (int i = 0; i < tempPhrase.length(); i++)
    {
      if (tempPhrase.substring(i, i + 1).equals(" "))
      {
        solvedPhrase += "  ";
      }  
      else
      {
        solvedPhrase += "_ ";
      }
    }  
    
    return tempPhrase;
  }  

  public boolean guessLetter(String guess)
  {
    boolean foundLetter = false;
    //String newSolvedPhrase = "";
    
    for (int i = 0; i < solvedPhrase.length(); i++)
    {
      if (solvedPhrase.substring(i, i + 1).equals(guess))
      {
        revealPhraseByLetter(guess);
        //newSolvedPhrase += guess + " ";
        foundLetter = true;
      }
      else
      {
        //newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";  
      }
    }
    //solvedPhrase = newSolvedPhrase;
    return foundLetter;
  } 
} 