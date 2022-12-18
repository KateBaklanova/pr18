public class Exception2 {

        Exception2() {};

        public void exceptionDemo() {
            System.out.println(2 / 0);
        }

        public static void main(String[] args) {
            Exception2 e2= new Exception2();
            try {
                e2.exceptionDemo();
            } catch (ArithmeticException e) {
                System.out.println("ошибка");
            }
        }
    }

