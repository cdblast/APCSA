/*
 * Activity 1.3.7
*/
public class ShapeEquals
{
  public static void main(String[] args) 
  {
    Shape shape1 = new Shape();
    shape1.setShape("Triangle", 3);
  
    Shape shape2 = new Shape();
    shape2.setShape("Square", 4);
  
    Shape shape3 = shape1;
    shape3.setShape("Hexagon", 6);

    Shape shape4 = new Shape();
    shape4.setShape("Square", 4);
    
    System.out.println(shape3.getShape());

    if (shape1 == shape2){
      System.out.println("shape1 == shape2: true");
    }
    else{
      System.out.println("shape1 == shape2: false");
    }

    if(shape2 == shape3){
      System.out.println("shape2 == shape3: true");
    }
    else{
      System.out.println("shape2 == shape3: false");
    }

    if(shape3 == shape1){
      System.out.println("shape3 == shape1: true");
    }
    else if(shape3 != shape1){
      System.out.println("shape3 == shape1: false");
    }

    if(shape4 == shape1){
      System.out.println("shape4 == shape1: true");
    }
    else{
      System.out.println("shape4 == shape1: false");
    }

    if(shape4 == shape2){
      System.out.println("shape4 == shape2: true");
    }
    else{
      System.out.println("shape4 == shape2: false");
    }

    if(shape4 == shape3){
      System.out.println("shape4 == shape3: true");
    }
    else{
      System.out.println("shape4 == shape3: false");
    }

  }
}
