package Praktikum6;

public class ChickenSotoRecipe implements Detail {
    @Override
    public int getPrice() {
        return 12000;
    }

    @Override
    public String ingredients1() {
        return "Daging Ayam Suwir";
    }

    @Override
    public String ingredients2() {
        return "Kuah Kuning (Kunyit)";
    }

    @Override
    public String ingredients3() {
        return "Soun dan Tauge";
    }
}