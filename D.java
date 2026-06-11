public class Adddia
 {
    public static void main(String[] args) {
        int n = 3;  

        for (int i = 1; i <= 2 * n - 1; i++) {
            

            int row;
            if (i <= n) {
                row = i;
            } else {
                row = 2 * n - i;
            }

             
            for (int j = 1; j <= row; j++) {
                System.out.print((char)('a' + j - 1));
            }


            for (int j = row - 1; j >= 1; j--) {
                System.out.print((char)('a' + j - 1));
            }

            System.out.println();
        }
    }
}
