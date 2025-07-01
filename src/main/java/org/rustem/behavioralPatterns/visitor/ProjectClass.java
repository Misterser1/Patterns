package org.rustem.behavioralPatterns.visitor;

public class ProjectClass implements ProjectVisitor{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
