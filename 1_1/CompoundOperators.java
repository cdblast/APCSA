/*
 * Activity 1.1.4
 */
public class CompoundOperators
{
  public static void main(String[] args)
  {
    int numPeople = 0;  
    double totalYears = 0;

    double years = 11.5;  // I will soon be halfway through my junior year.
    double friendsYears = 10.5;
    double siblingYears = 14.5;

    totalYears += years + friendsYears + siblingYears;
    numPeople += 3;

// CODE TO ADD
/*
* TODO 1) Add at least three other people to your program,
* such as siblings, friends, or neighbors.
*
* TODO 2) Use people that are in different grades to validate
* your program can work for different school grades.
*
* TODO 3) For their years in school, use values that indicate
* they will soon be halfway through their current
* school year, as shown in the provided code.
*/
    System.out.println("The average years me and my friends, siblings have been in school: " + (double) totalYears /numPeople);
    System.out.println("The total days we have all been in school (assuming 180 days each year): " + (double)totalYears *180);
    System.out.println("The average days we have all spent in school: " + (double)(totalYears *180) /numPeople);
/*
* TODO 4)The average years you and your friends, siblings,
* and neighbors have been in school.
*
* TODO 5) The total days you have all been in school,
* assuming you spend 180 days per year in school.
*
* TODO 6) The average days you have all spent in school.
 */

    int gradYear = 13;

  }
}