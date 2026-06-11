class Main {
    public static void main(String[] args) {

        int arr[] = {10, 25, 8, 40, 15};

    int smallest =arr[0];
    for(int i=1;i<arr.length;i++)
        if(arr[i]<smallest)
        smallest=arr[i];



        System.out.println ("smallest element = " + smallest);
    }}
    