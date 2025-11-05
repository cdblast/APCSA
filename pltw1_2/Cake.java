package pltw1_2;

/*
* Activity 1.2.2
*
* Another Cake class
*/
public class Cake
{    
  int tiers;

  public Cake()
  {
    tiers = 1;
    
    System.out.println("   ,,,\n   |||\n(~~~~~~~)\n(       )\n(~~~~~~~)\n");
  }
  
  public Cake(int t) 
  {
    tiers = t;
  
    System.out.println("      ,,,\n      |||\n  (**********)\n  (*        *)\n  (*        *)");
    System.out.println("(**************)\n(*            *)\n(*            *)\n(**************)\n");
  }

}
