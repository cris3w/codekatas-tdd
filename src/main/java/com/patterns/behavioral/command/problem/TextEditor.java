package com.patterns.behavioral.command.problem;

public class TextEditor {

    private String text = "";

    private String undoText = "";

    public void addText(String text) {
        undoText = this.text;
        this.text = text;
    }

    public void clearText() {
        undoText = text;
        this.text = "";
    }

    public String getText() {
        return text;
    }

    public void undo() {
        this.text = undoText;
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addText("1234");
        System.out.println("Text is: " + editor.getText());
        editor.clearText();
        System.out.println("Text is: " + editor.getText());
        editor.undo();
        System.out.println("Text is: " + editor.getText());
    }
}
