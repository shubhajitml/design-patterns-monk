package com.design.patterns.BehaviouralPatterns.MementoPatternBehavioural;

import java.util.Stack;

// CareTaker class : Manages the mementos / snapshots of the TextEditor state
public class CareTaker {
    private final Stack<EditorMemento> mementos = new Stack<>();

    public void saveState(TextEditor editor){
        mementos.push(editor.saveEditor());
    }

    public void undo(TextEditor editor){
        if(!mementos.isEmpty()){
            mementos.pop();
            if(!mementos.isEmpty()) { editor.restore(mementos.peek()); }
        }
    }
}
