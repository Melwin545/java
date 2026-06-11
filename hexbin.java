import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hex: ");
        String hex = sc.nextLine().toUpperCase().trim();

        String bin = "";
        for (char c : hex.toCharArray()) {
            int n;
            if (c >= '0' && c <= '9')      n = c - '0';
            else if (c >= 'A' && c <= 'F') n = c - 'A' + 10;
            else {
                System.out.println("Invalid hex!");
                return;
            }

            bin += String.format("%4s", Integer.toBinaryString(n)).replace(' ', '0');
        }

        bin = bin.replaceFirst("^0+(?!$)", "");
        if (bin.isEmpty()) bin = "0";

        System.out.println("Hex: " + hex);
        System.out.println("Bin: " + bin);

        sc.close();
    }
}