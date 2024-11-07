package com.design.patterns.BehaviouralPatterns.MementoPatternBehavioural;

public class TextEditor {
    private String content;
    private int cursorPosition;
    boolean isItalic;

    //setters
    public void write(String content) {
        this.content = content;
    }
    public void setCursorPosition(int cursorPosition) {
        this.cursorPosition = cursorPosition;
    }
    public void setItalic(boolean italic) {
        isItalic = italic;
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

    // save state and restore using memento (snapshot of state)
    public EditorMemento saveEditor(){
        return new EditorMemento(content, cursorPosition, isItalic);
    }

    public void restore(EditorMemento memento){
        this.content = memento.getContent();
        this.cursorPosition = memento.getCursorPosition();
        this.isItalic = memento.isItalic();
    }
}
