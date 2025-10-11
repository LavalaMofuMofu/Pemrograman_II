package praktikum4.Soal2;

import java.util.Scanner;

public class Soal3Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1=Kucing");
        System.out.println("2=Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String name = input.nextLine();

            System.out.print("Ras: ");
            String race = input.nextLine();

            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();

            catInfo cat = new catInfo(name, race, furColor);
            cat.display();
        }

        else if (choice == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String name = input.nextLine();

            System.out.print("Ras: ");
            String race = input.nextLine();

            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();

            System.out.print("Kemampuan: ");
            String abilityInput = input.nextLine();
            String[] ability = abilityInput.split(",");

            dogInfo dog = new dogInfo(name, race, furColor, ability);
            dog.display();
        }

        else {
            System.out.println("Pilihan Anda Diluar Opsi!!");
        }

        input.close();
    }
}