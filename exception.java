import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        try {
            if (!file.canRead()) {
                throw new Exception("File is not readable");
            }
            System.out.println("File is readable");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}