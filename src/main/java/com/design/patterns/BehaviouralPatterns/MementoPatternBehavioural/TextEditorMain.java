package com.design.patterns.BehaviouralPatterns.MementoPatternBehavioural;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker careTaker = new CareTaker();

        editor.write("Hello World!");
        careTaker.saveState(editor);
        editor.write("Hi Everyone!!");
        careTaker.saveState(editor);

        // Problem > undo the last write
        careTaker.undo(editor);
        System.out.println(editor.getContent());
    }
}
