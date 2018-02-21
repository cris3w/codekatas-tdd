package com.patterns.behavioral.command.example;

public abstract class AbstractCommand implements Command {

    private TextEditor textEditor;

    public AbstractCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public TextEditor getTextEditor() {
        return textEditor;
    }
}
