package com.design.patterns.BehaviouralPatterns.MementoPatternBehavioural;

public class TextEditorMemento {
    private String content;

    public void write(String text){
        this.content = text;
    }

    public String getContent(){ return content; }
}
