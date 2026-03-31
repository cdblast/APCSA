package partners;
/*
 * Activity 3.1.1
 */
public class Partners
{
  public static void main(String[] args)
  {    
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    String[] partners = new String[7];

    //set partners for M, W, F

    partners[1] = "Maddy"; //monday
    partners[3] = "Wendy"; //wednesday
    partners[5] = "Fip"; //friday

    System.out.println("On " + days[1] + " I have practice with " + partners[1]);
    System.out.println("On " + days[3] + " I have practice with " + partners[3]);
    System.out.println("On " + days[5] + " I have practice with " + partners[5]);

    //invite friend
    String[] friendPartners = partners;
    System.out.println("My friends partners are: " + friendPartners[1] + ", " + friendPartners[3] + ", and " + friendPartners[5] + ".");

    //change my partners  
    partners[1] = "NOT Maddy"; //monday
    partners[3] = "Waffle"; //wednesday
    partners[5] = "Fan2"; //friday

    System.out.println("My friends partners are: " + friendPartners[1] + ", " + friendPartners[3] + ", and " + friendPartners[5] + ".");
  }
}

