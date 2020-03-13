package com.company;

public class Weapon implements Item {
    private WeaponType type;
    private double weight;
    private double value;

    public enum WeaponType {
        Sword, Knife, Gun;
    }

    public Weapon(WeaponType type, double weight, double value) {
        this.type = type;
        this.weight = weight;
        this.value = value;
    }

    public WeaponType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String getName() {
        return type.name();
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type=" + type +
                ", weight=" + weight +
                ", value=" + value +
                '}';
    }

    @Override
    public double profitFactor() {
        return value / weight;
    }
}
