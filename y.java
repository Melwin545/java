public class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                if((i<3&&(j==i || j==4-i)) || (j==2 && i>2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
} 
