class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
    
        System.out.println("Enter any number");
        n=in.nextInt();
        if(n>0){
        System.out.println("Its a positive number");
        }
        in.close();
    }
}