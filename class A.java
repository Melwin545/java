import java.util.Scanner;

class A {
    int a;

    A() {
        a = 0;
    }

    public void get() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        a = in.nextInt();
    }
}

class B extends A {
    int b;

 
    B() {
        super();
        b = 0;
    }

    @Over
    public void get() {
        super.get();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value for b: ");
        b = in.nextInt();
    }
    public void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.get();       // Get values of a and b
        obj.display();   // Display them
    }
}
