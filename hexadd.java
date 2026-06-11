import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hex1: "); String a = sc.next().toUpperCase();
        System.out.print("Hex2: "); String b = sc.next().toUpperCase();

        String res = add(a, b);
        System.out.println(a + " + " + b + " = " + res);

        sc.close();
    }

    static String add(String a, String b) {
        String r = "";
        int c = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || c > 0) {
            int d1 = i >= 0 ? hexVal(a.charAt(i--)) : 0;
            int d2 = j >= 0 ? hexVal(b.charAt(j--)) : 0;
            int s = d1 + d2 + c;
            r = hexDigit(s % 16) + r;
            c = s / 16;
        }
        return r;
    }

    static int hexVal(char ch) {
        return (ch >= '0' && ch <= '9') ? ch - '0' : ch - 'A' + 10;
    }

    static char hexDigit(int n) {
        return n < 10 ? (char)('0' + n) : (char)('A' + n - 10);
    }
}