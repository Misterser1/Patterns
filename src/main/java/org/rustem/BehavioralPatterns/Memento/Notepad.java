package org.rustem.BehavioralPatterns.Memento;

public class Notepad {
    private String content;

    public void write(String text){
        this.content = text;
    }

    public String getContent() {
        return content;
    }

    public Memento createMemento(){
        return new Memento(this.content);
    }

    public void loadFromMemento(Memento memento){
        this.content = memento.getContent();
    }

    @Override
    public String toString() {
        return "Notepad{" +
                "content='" + content + '\'' +
                '}';
    }
}
