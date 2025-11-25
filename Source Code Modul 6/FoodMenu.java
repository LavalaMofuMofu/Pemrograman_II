package Praktikum6;

import java.util.Scanner;

public class FoodMenu {
    private CLI CLI;
    private Scanner sc;

    public FoodMenu(CLI CLI, Scanner sc) {
        this.CLI = CLI;
        this.sc = sc;
    }

    public void start() {
        boolean isRunning = true;
        while (isRunning) {
            String menuContent = "Silakan pilih menu makanan yang tersedia:\n" + "1. Nasi Goreng\n" + "2. Soto Ayam\n" + "3. Rendang\n" + "4. Ayam Geprek\n" + "\n" + "0. Keluar";

            CLI.showPage(menuContent);
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    ShowDetail(new FriedRice());
                    break;
                case "2":
                    ShowDetail(new ChickenSoto());
                    break;
                case "3":
                    ShowDetail(new Rendang());
                    break;
                case "4":
                    ShowDetail(new SmashedChicken());
                    break;
                case "0":
                    isRunning = false;
                    CLI.clear();
                    System.out.println("Terima kasih telah berkunjung ke warung Kami!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    try { Thread.sleep(1000); } catch (InterruptedException e) {}
                    break;
            }
        }
    }

    private void ShowDetail(Food food) {
        String detailContent = "Nama       : " + food.getName() + "\n" + "Deskripsi  : " + food.getDescription() + "\n" +  "Harga      : Rp " + food.getPrice() + "\n\n" + "--- Komposisi Utama ---\n" + food.getIngredientsInfo() + "\n\n" +
                        "Ketik 0 lalu ENTER untuk kembali ke menu utama.";

        CLI.showPage(detailContent);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("0")) {
                break;
            }
            else {
                System.out.println("Input tidak valid. Ketik 0 untuk kembali.");
            }
        }
    }
}