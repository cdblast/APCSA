// CODE TO ADD

import java.util.ArrayList;

public class ArrayListPerson
{  
  public static void main(String[] args)
  { 
    ArrayList<Person> newList = new ArrayList<Person>();
    newList.add(new Person(18, "Mike", true));

    //newList.add("My cousin"); //this returns an error because it is adding a string instead of a Person object
    for(Person p : newList){
        System.out.println(p.getName());
    }
  }
}