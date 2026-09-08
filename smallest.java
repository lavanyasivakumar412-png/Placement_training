import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int smallest = 9;

        if (n == 0)
            smallest = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit < smallest)
                smallest = digit;
            n /= 10;
        }

        System.out.println(smallest);
        sc.close();
    }
}