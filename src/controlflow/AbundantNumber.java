package controlflow;
import java.util.Scanner;


public class AbundantNumber {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter the number:");
        int number = sc.nextInt();   
        int sum = 0; 
        
        
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {  
                sum += i;          
            }
        }
        
        
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }
        
        
    }
}