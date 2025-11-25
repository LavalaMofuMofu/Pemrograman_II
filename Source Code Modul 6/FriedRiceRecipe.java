package Praktikum6;

public class FriedRiceRecipe implements Detail {
    @Override
    public int getPrice() {
        return 15000;
    }

    @Override
    public String ingredients1() {
        return "Nasi Putih";
    }

    @Override
    public String ingredients2() {
        return "Telur Mata Sapi";
    }

    @Override
    public String ingredients3() {
        return "Kecap Manis dan Bumbu";
    }
}