package org.rustem.Proxy;

public class ProxyBMW implements Car{
    private String engine;
    private String body;
    private BMW bmw;

    public ProxyBMW(String engine, String body) {
        this.engine = engine;
        this.body = body;
    }

    @Override
    public void create() {
        if (bmw == null) {
            bmw = new BMW(engine, body);
        }
        bmw.create();
        bmw.sale();
    }
}
