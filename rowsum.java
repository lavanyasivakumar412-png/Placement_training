 import java.util.Scanner;
 public class rowsum{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }

        int sum=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=a[i][j];
            }
        }
        System.err.println(sum);
        sc.close();
    }
 }
