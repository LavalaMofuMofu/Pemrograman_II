package Praktikum6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CLI CLI = new CLI();
        Scanner sc = new Scanner(System.in);
        FoodMenu menu = new FoodMenu(CLI, sc);
        menu.start();
    }
}