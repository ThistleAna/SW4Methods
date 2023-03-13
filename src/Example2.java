//METHOD NAME OVERLOADING WB Q.8

public class Example2 {
    public static void main(String[] args) { // main method
        myMethod("James"); // pass on argument James
        myMethod("Lilly"); // pass on argument Lilly

        myMethod ("Albus" , "Dumbledore"); // pass on arguments Albus and Dumbledore
        
        // call myMethod, name is Draco Lucius Malfoy
    }

    // create my own methods
    static void myMethod (String firstName) { // pass on parameter firstName
        System.out.println( firstName + " Potter");
    }

    // overload the method, to pass on firstName and lastName
    static void myMethod (String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }
    
    // create method to overload firstName, middleName and lastName
    
    
    
}
