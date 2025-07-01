package org.rustem.behavioralPatterns.visitor;

public class Senior implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Write good code...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Create good database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Create good tests...");
    }
}
