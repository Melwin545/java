public class Main{
    public static void main(String[] args){
        int[][] a={{1, 2, 3, 4},
                   {5, 6, 7, 8},
                   {9, 10, 11, 12},
                   {13 ,14 ,15 ,16}};

        int t=0,b=a.length-1,l=0,r=a[0].length-1;
        
        while(t<=b && l<=r){
            for(int j=l;j<=r;j++) 
            System.out.print(a[t][j]+" "); t++;
            
            for(int i=t;i<=b;i++) 
            System.out.print(a[i][r]+" "); r--;
            
            for(int j=r;j>=l;j--) 
            System.out.print(a[b][j]+" "); b--;
            
            for(int i=b;i>=t;i--) 
            System.out.print(a[i][l]+" "); l++;
        }
    }
}
