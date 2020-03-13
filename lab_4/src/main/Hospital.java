package main;

public class Hospital implements Comparable {
    // name and capacity are private so that no one may change them from outside of the class
    private String name;
    private int capacity;

    public Hospital(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Hospital(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Hospital h = (Hospital) o;
        return this.getName().compareTo(h.getName());
    }
}
