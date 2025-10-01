import java.util.Scanner;

public class PRAK103_2410817210005_MuhammadIrgiFahrezha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        int n = sc.nextInt();
        System.out.print("");
        int start = sc.nextInt();
        int count = 0;
        while (count < n) {
            if (start % 2 != 0) {
                System.out.print(start);
                count++;

                if (count < n) {
                    System.out.print(", ");
                }
            }

            start++;
        }

        sc.close();
    }
}
