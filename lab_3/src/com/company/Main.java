package com.company;

import java.util.Collections;

import static com.company.Weapon.WeaponType.Sword;

public class Main {

    public static void main(String[] args) {
        Knapsack backpack = new Knapsack(10);

        Book book1 = new Book("Dragon Rising", 300, 5);
        Book book2 = new Book("A Blade in the Dark", 300, 5);

        Food food1 = new Food("Cabbage", 2);
        Food food2 = new Food("Rabbit", 2);

        Weapon weapon = new Weapon(Sword, 5, 10);

        backpack.addItem(book1);
        backpack.addItem(book2);
        backpack.addItem(food1);
        backpack.addItem(food2);
        backpack.addItem(weapon);

        NameCompare nameCompare = new NameCompare();
        Collections.sort(backpack.getItems(), nameCompare);
        System.out.println(backpack.getItems());
    }
}
