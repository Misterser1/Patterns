package org.rustem.Prototype;

public class LabradorDog implements Dog {
    private String name;
    private String color;

    public LabradorDog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Dog cloneDog() {
        return new LabradorDog(this.name, this.color);
    }

    @Override
    public String toString() {
        return "LabradorDog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
