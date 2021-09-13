import com.sun.tools.classfile.ConstantPool;

import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        double num = 1.0;
        if (x==0){
            return num;
        }else{
            while (x>0){
                num = num * x;
                x--;
            }
        }
        return num;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double n = 1.0;
        String constantNum ="0.00000000001";
        String numCheck = "";
        double e = 1.0;
        while(numCheck.length() < (constantNum.length()-1)){
            e = e + 1/factorial((int) n);
            numCheck = numCheck + n;
            n++;
        }
        return e;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double squareRoot = Math.pow(x,0.5);
        return squareRoot;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter a Positive Number: ");
        double numInput = scan.nextDouble();
        System.out.println("The SquareRoot of " + numInput + " is: " + babylonian(numInput));
        System.out.println("The Value of e is Roughly: " + calculateE());

        scan.close();
    }
}
