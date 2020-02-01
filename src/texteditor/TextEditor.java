package texteditor;

import javax.swing.JFrame;

public class TextEditor {

    public static void main(String[] args) {
        textEditorGUI obj = new textEditorGUI();
        obj.setBounds(0, 0, 700, 700);
        obj.setTitle("Notepad");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setVisible(true);
    }
    
}
