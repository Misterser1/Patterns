package org.rustem.Builder;

public class Device {
    private String name;
    private String os;
    private String price;

    public void setName(String name) {
        this.name = name;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", os='" + os + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
