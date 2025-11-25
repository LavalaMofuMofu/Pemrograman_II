package Praktikum6;

public class CLI {
    public void header(){
        System.out.println("===================================================");
        System.out.println("              MENU RESTORAN SEDERHANA              ");
        System.out.println("===================================================");
    }

    public void footer(){
        System.out.println("===================================================");
        System.out.println("Masukkan angka lalu tekan ENTER untuk memilih menu");
        System.out.println("===================================================");
        System.out.print("Pilihan Anda: ");
    }

    public void clear(){
        for(int i =0; i< 2; i++){
            System.out.println();
        }
    }

    public void showPage(String content){
        clear();;
        header();
        System.out.println(content);
        footer();
    }
}