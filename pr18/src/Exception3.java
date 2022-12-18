import java.util.Scanner;

public class Exception3 {

        public void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }

    public static void main(String[] args) {
        Exception3 e3= new Exception3();
        try {
            e3.exceptionDemo();
        } catch (ArithmeticException e) {
            System.out.println("ошибка");
        }
    }

}
