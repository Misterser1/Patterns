package org.rustem.behavioralPatterns.visitor;

public class Database implements ProjectVisitor{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
