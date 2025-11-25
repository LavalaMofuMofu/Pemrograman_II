package Praktikum6;

public abstract class Food {
    protected String name;
    protected String description;
    protected Detail detail;

    public Food(String name, String description, Detail detail) {
        this.name = name;
        this.description = description;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice(){
        return detail.getPrice();
    }

    public String getIngredientsInfo(){
        return "Bahan Utama 1: " + detail.ingredients1() + "\n" + "Bahan Utama 2: " + detail.ingredients2() + "\n" + "Bahan Utama 3: " + detail.ingredients3();
    }
}