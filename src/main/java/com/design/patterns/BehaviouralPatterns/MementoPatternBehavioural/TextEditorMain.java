package com.design.patterns.BehaviouralPatterns.MementoPatternBehavioural;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.write("Hello World!");
        editor.write("Hi Everyone!!");
        // Problem > undo the last write
        
        System.out.println(editor.getContent());
    }
}
