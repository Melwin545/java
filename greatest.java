class Main {
    public static void main(String[] args) {
        int a = 23, b = 46, c = 28;

        if (a > b && a > c) {
            System.out.println("a is the greatest: " + a);
        } else if (b > a && b > c) {
            System.out.println("b is the greatest: " + b);
        } else {
            System.out.println("c is the greatest: " + c);
        }
    }
}
