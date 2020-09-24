package com.guepunya.personalscheduling;

import com.guepunya.personalscheduling.view.Run;
import javax.swing.UIManager;

/**
 *
 * @author Hello Willy Sianturi!
 */
public class PersonalScheduling {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            new Run().setVisible(true);
        }catch(Exception e){
            
        }
    }
}
