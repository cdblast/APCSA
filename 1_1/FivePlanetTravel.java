/* 
 * Activity 1.1.5
 */
public class FivePlanetTravel
{
  public static void main(String[] args)
  {
    // theplanets.org average distance from earth to the planets
    int mercury = 56974146;
    int venus = 25724767;
    int mars = 48678219;
    int jupiter = 390674710;
    int saturn = 792248270;

    // speed of light and our speed
    int lightSpeed =  670616629;
    lightSpeed /= 10;

    /* your code here 
     * 
    
    //without making new variables
    System.out.println("Travel time to mercury is " + (double)mercury /lightSpeed);
    System.out.println("Travel time to venus is " + (double)venus /lightSpeed);
    System.out.println("Travel time to mars is " + (double)mars /lightSpeed);
    System.out.println("Travel time to jupiter is " + (double)jupiter /lightSpeed);
    System.out.println("Travel time to saturn is " + (double)saturn /lightSpeed);
*/
    
    
    //with making new variables
    double travelMercury = (double)mercury /lightSpeed;
    double travelVenus = (double)venus /lightSpeed;
    double travelMars = (double)mars /lightSpeed;
    double travelJupiter = (double)jupiter /lightSpeed;
    double travelSaturn = (double)saturn /lightSpeed;

    System.out.println("Travel time to mercury is " + travelMercury);
    System.out.println("Travel time to venus is " + travelVenus);
    System.out.println("Travel time to mars is " + travelMars);
    System.out.println("Travel time to jupiter is " + travelJupiter);
    System.out.println("Travel time to saturn is " + travelSaturn);
     
    
  }
}
