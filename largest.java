import java.util.Scanner;

public class largest{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter a number 1: ");
        int num1= sc.nextInt();

        System.out.println("Enter a Number 2: ");
        int num2= sc.nextInt();
        
        if(num1>num2){
            System.out.println("Largest Number is "+num1);
        }
        else{
            System.out.println("Largest Number is "+num2);
        }
        

    }
    
}
