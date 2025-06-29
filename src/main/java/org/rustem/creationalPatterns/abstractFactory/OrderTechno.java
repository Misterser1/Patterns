    package org.rustem.creationalPatterns.abstractFactory;

    public class OrderTechno {
        public static void main(String[] args) {
            TechnoFactory technoFactory = new LaptopTechnoFactory();

            technoFactory.createCamera();
            technoFactory.createDisplay();
            technoFactory.createCharging();
        }
    }
