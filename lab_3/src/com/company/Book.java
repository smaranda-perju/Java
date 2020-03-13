package com.company;

public class Book implements Item {
    private String name;
    private int pageNumber;
    private double value;

    public Book(String name, int pageNumber, double value) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.value = value;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    @Override
    public double getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return (double) pageNumber / 100;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageNumber=" + pageNumber +
                ", value=" + value +
                '}';
    }

    @Override
    public double profitFactor() {
        return value / getWeight();
    }
}
