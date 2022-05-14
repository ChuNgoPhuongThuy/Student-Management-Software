/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Menu {
    private String kind;
    private JPanel jpanel;
    private JLabel jlabel;

    public Menu() {
    }

    public Menu(String kind, JPanel jpanel, JLabel jlabel) {
        this.kind = kind;
        this.jpanel = jpanel;
        this.jlabel = jlabel;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JPanel getJpanel() {
        return jpanel;
    }

    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }

    public JLabel getJlabel() {
        return jlabel;
    }

    public void setJlabel(JLabel jlabel) {
        this.jlabel = jlabel;
    }

//    public Object getJlb() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
