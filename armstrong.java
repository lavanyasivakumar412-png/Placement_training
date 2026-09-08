import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int original = num;
        int sum=0;

        while(num>0){
            int multi = num % 10;
            sum=sum+(multi*multi*multi);
            num = num/10;
        }

        if(sum==original){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
        sc.close();
    }
    
}
