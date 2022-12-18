
import java.util.Scanner;

public class Exception5 {
    public void getKey() throws Exception {

        printDetails("");
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        try {
            new Exception5().getKey();
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException in program");
        }
    }
}