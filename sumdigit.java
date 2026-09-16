import java.util.Scanner;
public class sumdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num= sc.nextInt();
        int digit=0;

        while(num!=0){
            int num1 = num%10;
            digit = digit+num1;
            num=num/10;
        }
        System.out.println("Sum of the digit:" +digit);
        sc.close();
    }
    
}
