import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        char c;
        Scanner in = new Scanner(System.in);
    
        System.out.println("Enter any vowels");
        c=in.nextLine().charAt(0);
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        System.out.println("Its a Vowel");
    else{
        System.out.println("Its not a Vowel");
    }
}
}
