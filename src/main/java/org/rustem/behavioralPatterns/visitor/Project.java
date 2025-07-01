package org.rustem.behavioralPatterns.visitor;

public class Project implements ProjectVisitor{
    private ProjectVisitor projectVisitor[];

    public Project() {
        this.projectVisitor = new ProjectVisitor[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }


    @Override
    public void beWritten(Developer developer) {
        for (ProjectVisitor project : projectVisitor){
            project.beWritten(developer);
        }
    }
}
