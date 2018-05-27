package mytexteditor;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

/**
 * @Imanuel Sinwany & Shiller Yehuda
 */
public class MyTextEditorGui extends javax.swing.JFrame {

    String filename = "";
    Clipboard clipboard=getToolkit().getSystemClipboard();
    private static DefaultHighlighter.DefaultHighlightPainter highlighter=new DefaultHighlighter.DefaultHighlightPainter(Color.red);

    public MyTextEditorGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        mainMenu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        exitProgram = new javax.swing.JMenuItem();
        editSubMenu = new javax.swing.JMenu();
        cutText = new javax.swing.JMenuItem();
        copyText = new javax.swing.JMenuItem();
        pasteText = new javax.swing.JMenuItem();
        helpSubMenu = new javax.swing.JMenu();
        aboutTextEditor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fileMenu.setText("File");

        newFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytexteditor/application-plus-icon-icon.png"))); // NOI18N
        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        fileMenu.add(newFile);

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        openFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytexteditor/open.png"))); // NOI18N
        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        fileMenu.add(openFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        saveFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytexteditor/save.png"))); // NOI18N
        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        fileMenu.add(saveFile);

        exitProgram.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        exitProgram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytexteditor/exitIcon.png"))); // NOI18N
        exitProgram.setText("Exit");
        exitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitProgramActionPerformed(evt);
            }
        });
        fileMenu.add(exitProgram);

        mainMenu.add(fileMenu);

        editSubMenu.setText("Edit");

        cutText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        cutText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytexteditor/cut-icon.png"))); // NOI18N
        cutText.setText("Cut");
        cutText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutTextActionPerformed(evt);
            }
        });
        editSubMenu.add(cutText);

        copyText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        copyText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytexteditor/copy-icon.png"))); // NOI18N
        copyText.setText("Copy");
        copyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTextActionPerformed(evt);
            }
        });
        editSubMenu.add(copyText);

        pasteText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        pasteText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytexteditor/clipboard-paste-image-icon.png"))); // NOI18N
        pasteText.setText("Paste");
        pasteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteTextActionPerformed(evt);
            }
        });
        editSubMenu.add(pasteText);

        mainMenu.add(editSubMenu);

        helpSubMenu.setText("Help");

        aboutTextEditor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mytexteditor/lifebuoy-plus-icon.png"))); // NOI18N
        aboutTextEditor.setText("About");
        aboutTextEditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutTextEditorActionPerformed(evt);
            }
        });
        helpSubMenu.add(aboutTextEditor);

        mainMenu.add(helpSubMenu);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        removehighlighter(textArea);
        searchTextArea(textArea, searchField.getText());
    }//GEN-LAST:event_searchButtonActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        textArea.setText("");
        this.setTitle(filename);
    }//GEN-LAST:event_newFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed

        FileDialog saveFile = new FileDialog(MyTextEditorGui.this, "Save File", FileDialog.SAVE);
        saveFile.setVisible(true);

        if (saveFile.getFile() != null) {

            filename = saveFile.getDirectory() + saveFile.getFile();
            setTitle(filename);
        }
        try {

            FileWriter filewriter = new FileWriter(filename);
            filewriter.write(textArea.getText());
            setTitle(filename);
            filewriter.close();

        } catch (IOException e) {
            System.out.println("Can't save the File");
        }
    }//GEN-LAST:event_saveFileActionPerformed

    private void pasteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteTextActionPerformed
        try {
            
    Transferable pasteText=   clipboard.getContents(MyTextEditorGui.this);
    String sel=(String)pasteText.getTransferData(DataFlavor.stringFlavor);
    textArea.replaceRange(sel,textArea.getSelectionStart(), textArea.getSelectionEnd());
    
        } catch (Exception e) {
            
            System.out.println("Didn't work!");
            
        }
 
    }//GEN-LAST:event_pasteTextActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void removehighlighter(JTextComponent areatext){
        
        Highlighter removehighlighter=areatext.getHighlighter();
        Highlighter.Highlight remove []=removehighlighter.getHighlights();
    
        for (int i = 0; i < remove.length; i++) {
            if (remove[i].getPainter() instanceof DefaultHighlighter.DefaultHighlightPainter)
                removehighlighter.removeHighlight(remove[i]);
        }
    
    }
    private void searchTextArea(JTextComponent textArea, String word){
        
        try {
            
            Highlighter highlight=textArea.getHighlighter();
            Document doc=textArea.getDocument();
            String text=doc.getText(0, doc.getLength());
            
            int pos=0;
            
            while ((pos=text.toUpperCase().indexOf(word.toUpperCase(),pos))>=0){
                highlight.addHighlight(pos, pos+word.length(), highlighter);
                pos+=word.length();
            }
            
        } catch (Exception e) {
        }
    }        

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed

        FileDialog openFile = new FileDialog(this, "open file", FileDialog.LOAD);
        openFile.setVisible(true);

        if (openFile.getFile() != null) {

            filename = openFile.getDirectory() + openFile.getFile();
            this.setTitle(filename);

            try {

                BufferedReader reader = new BufferedReader(new FileReader(filename));
                StringBuilder builder = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    builder.append(line + "\n");
                }

                textArea.setText(builder.toString());
                reader.close();

            } catch (IOException e) {
                System.out.println("Can't read from file!");
            }

        }
    }//GEN-LAST:event_openFileActionPerformed

    private void exitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitProgramActionPerformed
        int choise = JOptionPane.showConfirmDialog(MyTextEditorGui.this, "Do you want to save your changes?", "An Inane Question", JOptionPane.YES_NO_OPTION);
        if (choise == JOptionPane.YES_OPTION) {
            saveFileActionPerformed(evt);
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_exitProgramActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int choise = JOptionPane.showConfirmDialog(MyTextEditorGui.this, "Do you want to save your changes?", "An Inane Question", JOptionPane.YES_NO_OPTION);
        if (choise == JOptionPane.YES_OPTION) {

            FileDialog saveFile = new FileDialog(MyTextEditorGui.this, "Save File", FileDialog.SAVE);
            saveFile.setVisible(true);

            if (saveFile.getFile() != null) {

                filename = saveFile.getDirectory() + saveFile.getFile();
                setTitle(filename);
            }
            try {

                FileWriter filewriter = new FileWriter(filename);
                filewriter.write(textArea.getText());
                setTitle(filename);
                filewriter.close();

            } catch (IOException e) {
                System.out.println("Can't save the File");
            }

        } else {
            System.exit(0);
        }

    }//GEN-LAST:event_formWindowClosing

    private void aboutTextEditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutTextEditorActionPerformed
        JOptionPane.showMessageDialog(MyTextEditorGui.this,"My Simple Editor Product Version 1.0.0", "My Simple Editor", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_aboutTextEditorActionPerformed

    private void cutTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutTextActionPerformed

        String cutstring=textArea.getSelectedText();
        StringSelection cutSelection=new StringSelection(cutstring);
        clipboard.setContents(cutSelection, cutSelection);
        textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
    }//GEN-LAST:event_cutTextActionPerformed

    private void copyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTextActionPerformed
       String copytext=textArea.getSelectedText();
       StringSelection copyselection=new StringSelection(copytext);
       clipboard.setContents(copyselection, copyselection);
    }//GEN-LAST:event_copyTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyTextEditorGui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyTextEditorGui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyTextEditorGui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyTextEditorGui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyTextEditorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutTextEditor;
    private javax.swing.JMenuItem copyText;
    private javax.swing.JMenuItem cutText;
    private javax.swing.JMenu editSubMenu;
    private javax.swing.JMenuItem exitProgram;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpSubMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem pasteText;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
