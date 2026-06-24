public class Main {

    static void verifyAge(int age) {
        if (age < 23 || age > 27) {
            throw new ArithmeticException("Age should be between 23 and 27 only");
        }
        System.out.println("Age verified");
    }

    public static void main(String[] args) {
        try {
            verifyAge(25);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}