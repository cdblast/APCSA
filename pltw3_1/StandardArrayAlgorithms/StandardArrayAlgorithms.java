/*
 * Activity 3.1.4
 */
public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    Player[] players = {new Player("Alex", 12), new Player("Aiden", 13),
                    new Player("Bobbie", 18), new Player("Blaine", 20),
                    new Player("Chris", 15), new Player("Charlie", 15)};

    /*//step 1 and 2 average
    int sum = 0;
    for (int i = 0; i < goals.length; i++)
      sum += goals[i];
    
    double result = sum/goals.length;
    System.out.println("All goals: " + sum + "\n Average goals: " + result);
    */
    /*//step 5 max min algorithm
    int max = 0;
    int min = 999;

    for (int i = 0; i < goals.length; i++){
      if(goals[i] > max){
        max = goals[i];
      }
      else if(goals[i] < min){
        min = goals[i];
      }
    }
    
    System.out.println("Max: " + max + "\nMin: " + min);
    */
  
    boolean hasValue = false;
    for(Player p : players){
      if(p.getAge() >= 18){
        hasValue = true;
      }
    }
  }
  
}