import java.util.Scanner;

public class largest3 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number 1:");
    int num1= sc.nextInt();

    System.out.println("Enter a number 2:");
    int num2= sc.nextInt();

    System.out.println("Enter a number 3:");
    int num3= sc.nextInt();

    if(num1>num2 && num1>num3){
        System.out.println("Largest number is "+num1);
    }
    else if(num2>num1 && num2>num3){
        System.out.println("Largest number is "+num2);
    }
    else{
        System.out.println("Largest number is "+num3);
    }
    sc.close();
    }
    }

