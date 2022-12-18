
import java.util.Scanner;

public class Exception4  {

        public void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            }
            catch (Exception e){
                System.out.println("Error");
            }
            // Как правило, операторы блока finally выполняются, когда элемент управления покидает оператор try .
            // Передача управления может возникать в результате нормального выполнения
            finally {
                System.out.println("End");
            }
        }

    public static void main(String[] args) {
            Exception4 e4 = new Exception4();
            e4.exceptionDemo();
        }
    }


