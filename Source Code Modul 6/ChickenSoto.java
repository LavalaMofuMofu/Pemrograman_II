package Praktikum6;

import Menu.ChickenSotoRecipe;
import Menu.Food;

public class ChickenSoto extends Food {
    public ChickenSoto() {
        super("Soto Ayam Lamongan",
                "Soto ayam hangat dengan kuah kuning segar",
                new ChickenSotoRecipe());
    }
}