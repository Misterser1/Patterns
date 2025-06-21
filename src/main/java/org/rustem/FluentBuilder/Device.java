package org.rustem.FluentBuilder;

public class Device {
    private String name;
    private String os;
    private String price;

    public static class Builder {
        private String name;
        private String os;
        private String price;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOs(String os) {
            this.os = os;
            return this;
        }

        public Builder setPrice(String price) {
            this.price = price;
            return this;
        }

        public Device build() {
            Device device = new Device();
            device.name = this.name;
            device.os = this.os;
            device.price = this.price;
            return device;
        }
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
