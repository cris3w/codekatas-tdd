package com.examples.behavioral.command.example;

public class ClearTextCommand extends AbstractCommand {

    private String undoText = "";

    public ClearTextCommand(TextEditor textEditor) {
        super(textEditor);
    }

    public void action() {
        undoText = getTextEditor().getText();
        getTextEditor().setText("");
    }

    public void undo() {
        getTextEditor().setText(undoText);
    }
}
