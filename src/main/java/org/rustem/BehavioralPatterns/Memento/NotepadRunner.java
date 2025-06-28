package org.rustem.BehavioralPatterns.Memento;

public class NotepadRunner {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        History history = new History();

        notepad.write("Hello how are you?");

        System.out.println(notepad);

        history.setMemento(notepad.createMemento());

        notepad.write("Im good");

        System.out.println(notepad);

        notepad.loadFromMemento(history.getMemento());

        System.out.println(notepad);
    }
}
