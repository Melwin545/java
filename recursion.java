public class Main {

    static void cd(int value) {
        if (value == 0) {
            return;
        }

        System.out.println(value);
        cd(value - 1);
    }

    public static void main(String[] args) {
        cd(12);
    }
}