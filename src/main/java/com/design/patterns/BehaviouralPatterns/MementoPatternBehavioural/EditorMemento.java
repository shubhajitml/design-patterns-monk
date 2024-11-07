package com.design.patterns.BehaviouralPatterns.MementoPatternBehavioural;

// EditorMemento class : Stores the internal states / snapshots / mementos of the TextEditor
public class EditorMemento {

    private String content;
    private int cursorPosition;
    boolean isItalic;

    public EditorMemento(String content, int cursorPosition, boolean isItalic) {
        this.content = content;
        this.cursorPosition = cursorPosition;
        this.isItalic = isItalic;
    }

    //getters
    public String getContent() {
        return content;
    }
    public int getCursorPosition() {
        return cursorPosition;
    }
    public boolean isItalic() {
        return isItalic;
    }
}
