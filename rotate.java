public class ArrayRotationEasy {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 1, 2};

        boolean isRotation = false;
        int n = a.length;

        if (a.length == b.length) {

            for (int i = 0; i < n; i++) {
                if (a[i] == b[0]) {

                    boolean match = true;

                    for (int j = 0; j < n; j++) {
                        if (a[(i + j) % n] != b[j]) {
                            match = false;
                            break;
                        }
                    }

                    if (match) {
                        isRotation = true;
                        break;
                    }
                }
            }
        }

        System.out.println(isRotation);
    }
}
