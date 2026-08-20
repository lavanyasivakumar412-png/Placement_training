import java.util.Scanner;

public class Divide_by_5{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1= sc.nextInt();

        if(num1%5==0){
            System.out.println(num1+"is divisible by 5");
        }
        else{
            System.out.println(num1+"is not divisible by 5");
        }
        sc.close();
    }
    
}
