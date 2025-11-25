package Praktikum6;

public class RendangRecipe implements Detail {
    @Override
    public int getPrice() {
        return 20000;
    }

    @Override
    public String ingredients1() {
        return "Daging Sapi Pilihan";
    }

    @Override
    public String ingredients2() {
        return "Santan Kental";
    }

    @Override
    public String ingredients3() {
        return "Bumbu Rendang Lengkap";
    }
}