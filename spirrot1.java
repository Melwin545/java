public class Main {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int t = 0, b = a.length - 1, l = 0, r = a[0].length - 1;

        while (t < b && l < r) {
            int prev = a[t + 1][l], temp, i = l;

            while (i <= r) {
                temp = a[t][i];
                a[t][i] = prev;
                prev = temp;
                i++;
            }
            i = t + 1;
            while (i <= b) {
                temp = a[i][r];
                a[i][r] = prev;
                prev = temp;
                i++;
            }
            i = r - 1;
            while (i >= l) {
                temp = a[b][i];
                a[b][i] = prev;
                prev = temp;
                i--;
            }
            i = b - 1;
            while (i >= t) {
                temp = a[i][l];
                a[i][l] = prev;
                prev = temp;
                i--;
            }
            t++; b--; l++; r--;
        }

        int i = 0, j;
        while (i < a.length) {
            j = 0;
            while (j < a[0].length) {
                System.out.print(a[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
