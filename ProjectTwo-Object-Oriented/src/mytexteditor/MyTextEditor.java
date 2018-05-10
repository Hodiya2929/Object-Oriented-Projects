/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytexteditor;

/**
 *
 * @author �?ני
 */
public class MyTextEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyTextEditorGui mynote=new MyTextEditorGui();
        mynote.setBounds(0, 0, 700,700);
        mynote.setTitle("My Text Editor");
        mynote.setVisible(true);
        mynote.setResizable(false);
        mynote.setDefaultCloseOperation(MyTextEditorGui.DO_NOTHING_ON_CLOSE);
        
    }
    
}
