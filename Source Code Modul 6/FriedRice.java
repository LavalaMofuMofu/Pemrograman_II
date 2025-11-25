package Praktikum6;

import Menu.Food;
import Menu.FriedRiceRecipe;

public class FriedRice extends Food {
    public FriedRice() {
        super("Nasi Goreng Spesial",
                "Nasi goreng klasik dengan telur ceplok",
                new FriedRiceRecipe());
    }
}