/*
 * Activity 2.1.4
 */
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = "Stardust returns from whence it came";
		System.out.println("Letter frequencies in '" + phrase + "'");

    /* your code here */
    int[] letterCount = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int end = phrase.length() - 1;
    phrase = phrase.toLowerCase();
    for(int a = 0; a <= 24; a++)
      {
        int tempNum = letterCount[a];
        for(int i = 0; i <= end; i++){
        if(phrase.substring(i, i +1).equals(letters.substring(a, a+1)))
        {
            //System.out.println(letters.substring(a, a+1) + i);
            tempNum++;
            letterCount[a] = tempNum;
        }
        }
      }
      
      for(int a = 0; a <= 24; a++){
        if(!(letterCount[a] == 0)){
        System.out.println(letters.substring(a, a+1) + " occurs " + letterCount[a] + " times");
        }
    }
	}
}
