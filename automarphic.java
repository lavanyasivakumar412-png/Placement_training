import java.util.Scanner;

class automarphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int square = n * n;

        if (square % (int)Math.pow(10, String.valueOf(n).length()) == n)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");

        sc.close();
    }
}