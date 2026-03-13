/*
 * Activity 2.2.5
 */
public class HikeRunner
{
  public static void main(String[] args)
  {
    Hike hike1 = new Hike("Sharp Top", 3.3, 1253);
    System.out.println(hike1);
    Hike hike2 = new Hike("Apple Orchard", 2.6, 1003);
    System.out.println(hike2);
    Hike hike3 = new Hike("Third Hike");
    System.out.println(hike3);
    Hike hike4 = new Hike("The Fourth One", 4.44);
    System.out.println(hike4);

    System.out.println("First hike longer? " + hike1.isLongerThan(hike2));
    System.out.println("First hike higher? " + hike1.isHigherThan(hike2)); 
  }
}