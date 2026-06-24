import java.io.FileReader;
import java.io.IOException;

public class Main {

    static void readfile() throws IOException {
        FileReader fr = new FileReader("abc.txt");
    }

    public static void main(String[] args) {

        try {
            readfile();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }

    }
}