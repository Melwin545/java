public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        int top=0, bottom=a.length-1, left=0, right=a[0].length-1, prev, temp;

        for(; top<bottom && left<right; top++, bottom--, left++, right--) {
            prev = a[top+1][left];

            for(int col=left; col<=right; col++) {
                temp = a[top][col]; 
                a[top][col] = prev; 
                prev = temp; 
            }
            for(int row=top+1; row<=bottom; row++) {
                temp = a[row][right]; 
                a[row][right] = prev; 
                prev = temp; 
            }
            for(int col=right-1; col>=left; col--) {
                temp = a[bottom][col]; 
                a[bottom][col] = prev; 
                prev = temp; 
            }
            for(int row=bottom-1; row>=top; row--) {
                temp = a[row][left]; 
                a[row][left] = prev; 
                prev = temp; 
            }
        }
            for(int row=0; row<a.length; row++) {
            for(int col=0; col<a[0].length; col++) 
            System.out.print(a[row][col]+" ");
            System.out.println();
        }
    }
}
