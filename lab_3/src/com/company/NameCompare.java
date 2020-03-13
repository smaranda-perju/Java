package com.company;

import java.util.Comparator;

public class NameCompare implements Comparator<Item> {
    public int compare(Item i1, Item i2) {
        return i1.getName().compareTo(i2.getName());
    }
}
