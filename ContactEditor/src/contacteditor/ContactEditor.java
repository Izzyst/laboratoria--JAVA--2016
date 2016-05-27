/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacteditor;

import javax.swing.JFrame;

/**
 *
 * @author Izabela
 */
public class ContactEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JFrame frame = new JFrame("WITAJ");    // utworzenie okna ramowego z podanym tytułem   
        // ContactEditorUI cos = new ContactEditorUI();
         frame.setLocationRelativeTo(null);  // centrowanie okna w obszarze pulpitu   
        frame.setVisible(true);             // pokazanie okna  
    }
    
}
