package pltw1_2;

public class assignment126 {
    public static void main(String[] args){
        
        // A String created using a literal
        String literal = "I've never been to the state of ";
        String literalState = "Maine";
        // An immutable String
        String immutableState = new String("Maine");

        // The + operator for concatenation
        System.out.println(literal + immutableState);
        // An implicit type conversion via concatenation
        int age = 17;
        System.err.println("in all my " + age + " years of life!");

        // The += operator for concatenation
        literal += literalState;
        System.out.println(literal);

    }
    
}
