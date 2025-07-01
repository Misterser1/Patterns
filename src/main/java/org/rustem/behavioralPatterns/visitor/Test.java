package org.rustem.behavioralPatterns.visitor;

public class Test implements ProjectVisitor{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
