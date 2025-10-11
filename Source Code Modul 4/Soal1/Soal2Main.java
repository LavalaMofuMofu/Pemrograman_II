package praktikum4.Soal1;

import java.util.Scanner;

public class Soal2Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String name = input.nextLine();

        System.out.print("Ras: ");
        String race = input.nextLine();

        Pet pet1 = new Pet (name, race);
        pet1.display();
    }
}
