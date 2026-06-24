import java.io.FileReader;
import java.io.IOException;

public class Main {

    static void withdraw(int amount){
        if(amount%100!=0){
            throw new ArithmeticException ("Amount should be multiple of 100");
        }
        System.out.println("Cash dispensed");
        }
        public static void main(String []args){
        try{
            withdraw(1000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        
        }
        }
    }