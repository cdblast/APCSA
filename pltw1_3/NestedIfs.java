/*
 * Activity 1.3.3
 */
public class NestedIfs
{
  public static void main(String[] args)
  {
    int temperature = 77;
    int windGusts = 12;
    
    if (temperature < 91) 
    {
      if (temperature > 65)
      {
        if (windGusts < 18)
        {
          System.out.println("It's a great day to go camping!");
        }
        else
        {
          System.out.println("It's too windy outside.");
        }
      }
      else
      {
        System.out.println("It's too cold outside.");
      }
    }
    else
    {
      if (windGusts >= 18)
      {
          System.out.println("It's too windy and too hot outside.");
      }
      else 
      {
        System.out.println("It's too hot outside.");
      }
    }
  }
}