public class bordsum {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int sum = 0;
        int a = arr.length;        
        int b = arr[0].length;     

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
                    sum += arr[i][j];
                }p
            }
        }

        System.out.println("Sum of border elements: " + sum);
    }
}
