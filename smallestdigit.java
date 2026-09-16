import java.util.Scanner;
public class smallestdigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        int smallest=9;

        while(num!=0){
            int digit=num%10;
            if(smallest>digit){
                smallest=digit;
            }
            num=num/10;
        }
        System.out.println("Smallest number of digit:" +smallest);
    }
}
