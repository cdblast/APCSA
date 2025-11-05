/*
 * Activity 1.2.5
 */
public class Dog
{
  String name;
  int age;

  public Dog(String n)
  {
    name = n;
  }
  
  public Dog(String n, int a)
  {
    name = n;
    age = a;
  }
  
  public int getAge()
  {
    return age;
  }
  
  public String getName()
  {
    return name;
  }
  
  public boolean isGoodDog()
  {
   return true;
  }
    
  public int goOutside()
  {
    return 15;
  }
  
  public int goOutside(double hours)
  {
    return (int) (hours * 60);
  }
  
  public String getToy()
  {
    return "ball";
  }

  public void sit()
  {
    System.out.println("OK! I am sitting.");
  }

  public void speak()
  {
    System.out.println("arf arf!");
  }

  public void walk(int numMinutes)
  {
    System.out.println("I love to walk for " + numMinutes + " minutes.");
  }

  public void walk(int numMinutes, String park)
  {
    System.out.println("I love to walk for " + numMinutes + " minutes and go to " + park + "!");
  }
  
  public void eat(int numTimes)
  {
    System.out.println("I eat " + numTimes + " time(s) a day.");
  }

  public void eat(String food)
  {
    System.out.println("I eat " + food + ".");
  }

  public void eat(String food, int numTimes)
  {
    System.out.println("I eat " + food + " " + numTimes + " times a day.");
  }

  public void eat(String food, double amount, int numTimes)
  {
    System.out.println("I eat " + amount + " cups of " + food + " " + numTimes + " times a day.");
  }
  
  public void setAge(int years)
  {
    System.out.println("I am " + years + " years old.");
  }

  public void setAge(int years, int months)
  {
     System.out.println("I am " + years + " years and " + months + " months old.");
  }
  
  public void setAge(double years)
  {
    System.out.println("I am " + years + " years old.");
  }
  
    public void play()
  {
    System.out.println("Oh boy! I get to play with my master!");
  }

  public void play(String toy)
  {
    System.out.println("Oh boy! I get to play with my " + toy + "!");
  }

}
