package cwiczenie2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Math1 {
    public static int div(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Division by Zero");
        }else {
            return a/b;
        }
    }


    //Wyjątki różnego rodzaju w jednym try
    public static void div(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("First number: ");
            int num1=scanner.nextInt();
            System.out.println("Second number: ");
            int num2=scanner.nextInt();
            System.out.print(num1/num2);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }catch(InputMismatchException e){
            System.out.println("Wrong value type");
        }
    }
}
