package Praktikum6;

public class SmashedChickenRecipe implements Detail {
    @Override
    public int getPrice() {
        return 12000;
    }

    @Override
    public String ingredients1() {
        return "Paha atau Dada Ayam";
    }

    @Override
    public String ingredients2() {
        return "Cabe rawit";
    }

    @Override
    public String ingredients3() {
        return "Minyak dan Bawang Putih";
    }
}
