import java.util.Scanner;

public class PRAK105_2410817210005_MuhammadIrgiFahrezha {
    public static void main(String[] args) {
       final double phi = 3.14;

       Scanner sc = new Scanner(System.in);

       System.out.print("Masukkan jari - jari: ");
       double r = sc.nextDouble();

       System.out.print("Masukkan tinggi: ");
       double h = sc.nextDouble();

       double volume = phi * r * r * h;

       System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", r, h, volume);

       sc.close();
    }
}
