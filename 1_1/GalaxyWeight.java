/* 
 * Activity 1.1.3
 */
public class GalaxyWeight
{
  public static void main(String[] args)
  {
  
    int weightOnEarth = 177;
    double earthGravity = 9.81;
    double jupiterGravity = 24.79;
    double venusGravity = 8.87;
    double neptuneGravity = 11.15;
    double mercuryGravity = 3.59;
    
    // calculate weight
    double weightOnJupiter = weightOnEarth * jupiterGravity / earthGravity;
    double weightOnVenus = weightOnEarth * venusGravity / earthGravity;
    double weightOnNeptune = weightOnEarth * neptuneGravity / earthGravity;
    double weightOnMercury = weightOnEarth * mercuryGravity / earthGravity;
    
    // show results
    System.out.print("Your weight on Jupiter is ");
    System.out.print(weightOnJupiter);
    System.out.println(" lbs.");
    System.out.println();
    
    System.out.print("Your weight on Venus is ");
    System.out.print(weightOnVenus);
    System.out.println(" lbs.");
    System.out.println();
    
    System.out.print("Your weight on Neptune is ");
    System.out.print(weightOnNeptune);
    System.out.println(" lbs.");
    System.out.println();
    
    System.out.print("Your weight on Mercury is ");
    System.out.print(weightOnMercury);
    System.out.println(" lbs.");
    System.out.println();
  }
}