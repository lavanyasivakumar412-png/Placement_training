import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original=num;
        int sum = 0;

        while (num>0) {
            int reg = num % 10;
            sum=sum*10+reg;
            num=num/10;
        }

        if(sum==original){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
