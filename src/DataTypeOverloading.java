// WB Methods, Q.8 plusMethod

public class DataTypeOverloading {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5); // output = 13
        double myDouble = plusMethod( 10.5 , 11.7); // output = 22.2

        System.out.println(myNum1);
        System.out.println(myDouble);
    }

}
