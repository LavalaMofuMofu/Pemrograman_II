import java.util.Scanner;

public class PRAK101_2410817210005_MuhammadIrgiFahrezha {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String name = sc.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String placeOfBirth = sc.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        String dateOfBirth = sc.nextLine();

        System.out.print("Masukkan Bulan Lahir: ");
        int monthOfBirth = sc.nextInt();
        sc.nextLine();

        String months = switch (monthOfBirth) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "Bulan Yang Dimasukkan Tidak Valid";
        };

        System.out.print("Masukkan Tahun Lahir: ");
        int yearOfBirth = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan Tinggi Badan: ");
        String height = sc.nextLine();

        System.out.print("Masukkan Berat Badan: ");
        String weight = sc.nextLine();

        System.out.print ("\nNama Lengkap " + name + ", Lahir di " + placeOfBirth + " pada Tanggal " + dateOfBirth + ", " +
                months + " " + yearOfBirth + "\nTinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");
    }
}
