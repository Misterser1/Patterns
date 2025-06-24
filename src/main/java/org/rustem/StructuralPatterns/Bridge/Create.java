package org.rustem.StructuralPatterns.Bridge;

public abstract class Create {
    protected Color color;

    public Create(Color color){
        this.color = color;
    }

    public abstract void create();
}
