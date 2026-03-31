/*
 * Activity 3.1.1
 */
public class DogArray
{
  public static void main(String[] args)
  {
    Dog[] myDogs = {new Dog("Lady"), new Dog("Tramp"), new Dog("Trusty")};

    Dog[] neighborsDogs = new Dog[2];

    System.out.println("My dogs names are " + myDogs[0].getName() + ", " + myDogs[1].getName() + ", and " + myDogs[2].getName());

    neighborsDogs[0] = new Dog("Bluey");
    neighborsDogs[1] = new Dog("Bingo");
    System.out.println(neighborsDogs[0] + " and " + neighborsDogs[1]);

    Dog[] friendsDogs = {new Dog("Lady"), new Dog("Tramp")};
    System.out.println(friendsDogs[0] + " and " + friendsDogs[1]);
    
  }
}