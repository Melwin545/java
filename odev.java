class Main {
    public static void main(String[] args) {

        int arr[] = {10, 25, 8, 40, 15};
        int odd = 0;
        int even =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0)
            even ++;
            else 
            odd ++;
        }
         System.out.println("Even Numbers =" +even);
         System.out.println("Odd Number =" +odd);
            
        }}
   