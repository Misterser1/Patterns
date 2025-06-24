package org.rustem.Proxy;

public class BMW implements Car{
    private String engine;
    private String body;

    public BMW(String engine, String body){
        this.engine = engine;
        this.body = body;
        System.out.println("BMW instance created");
    }

    public void sale(){
        System.out.println("BMW sale...");
    }

    @Override
    public void create() {
        System.out.println("Create BMW put engine: " + engine + " put body: " + body);
    }


}
