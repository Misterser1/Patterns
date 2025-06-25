package org.rustem.BehavioralPatterns.Iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java Core", "Spring", "Hibernate", "PostgreSQL", "Docker", "Kafka", "Kubernetes"};
        Developer developer = new Developer("Java", "Rustem", skills);

        Iterator iterator = developer.getIterator();

        System.out.println("Language: " + developer.getLanguage());
        System.out.println("Name: " + developer.getName());
        System.out.println("Skills: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
