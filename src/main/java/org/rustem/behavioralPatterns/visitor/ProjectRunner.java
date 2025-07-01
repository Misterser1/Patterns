package org.rustem.behavioralPatterns.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer developer = new Junior();

        project.beWritten(developer);
    }
}
