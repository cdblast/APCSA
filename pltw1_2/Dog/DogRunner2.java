/*
 * Activity 1.2.5
 */
public class DogRunner2
{
  public static void main(String[] args)
  {
    Dog d = new Dog("Duke",2); // Duke is 2 years old

    String name = d.getName();
    int age = d.getAge();
    int outsideMorning = d.goOutside();
    int outsideAfternoon = d.goOutside(1.5);
    
    System.out.println("I have a new dog that is " + age + " years old!");
    System.out.println("He is a " + d.isGoodDog() + " good dog.");

    System.out.println(name + " has a new " + d.getToy() +".");

    System.out.println("In the morning, Duke goes out for " + outsideMorning + " minutes.");
    System.out.println("In the afternoon, Duke goes out for " + outsideAfternoon + " minutes.");
    System.out.println("Duke spends " + (int)(outsideAfternoon + outsideMorning) + " minutes outside a day!");
  }
}