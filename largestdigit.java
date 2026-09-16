import java.util.Scanner;
public class largestdigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        int largest=0;

        while(num!=0){
            int digit=num%10;
            if(largest<digit){
                largest=digit;
            }
            num=num/10;
        }
        System.out.println("Largest number of digit:" +largest);
    }
}
