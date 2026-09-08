import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int d = sc.nextInt();
        int count = 0;

        if (n == 0 && d == 0)
            count = 1;

        while (n > 0) {
            if (n % 10 == d)
                count++;
            n /= 10;
        }

        System.out.println(count);
        sc.close();
    }
}