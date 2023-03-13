// METHOD OVERLOADING : same method name, passing different numbers of argument
public class Example3 {
    static int myMethod (int x) { // passing 1 argument
        return 5 + x; // use return keyword, return int value
    }
    
    static int myMethod (int x, int y) { // passing 2 arguments
        return x -y;
    }
    
    
    public static void main(String[] args) { // main method
        System.out.println(myMethod(3)); // output 5 + 3 = 7
        System.out.println(myMethod(5)); // OUTPUT 5 + 5 = 10

        System.out.println(myMethod(10, 5)); // output 10 - 5 = 5
    }
}
