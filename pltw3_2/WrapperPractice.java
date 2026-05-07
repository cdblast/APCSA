// CODE TO ADD
public class WrapperPractice
{
    public static void main(String[] args)
    {
        Integer integerConstructor = new Integer(4);//Integer Constructor
        System.out.println(integerConstructor.intValue());//intValue method
        
        Double doubleConstructor = new Double(0.5);//Double Constructor
        System.out.println(doubleConstructor.doubleValue());//doubleValue method
        
        System.out.println("An integer's maximum value is " + Integer.MAX_VALUE + ", and minimum value is " + Integer.MIN_VALUE + ".");//max & min value of an integer
        
        
        Integer integerInstance = 5;
        Double doubleInstance = 2.0;//autoboxing
        
        int intInst = integerInstance;
        double doubleInst = doubleInstance;//unboxing
    }
}