
package MainControl;

import Control.Menu;
import View.AddStudent;
import View.DanhSachLop;
import View.NhapDiem;
import View.TimKiem;
import View.TongKetHocKy;
import View.TongKetMon;
import View.TrangChuJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class SwitchControl {
    private JPanel jpanelRoot;
    private String kindSelect = "";
    List<Menu> menu = null;

    public SwitchControl(JPanel jpanelRoot) {
        this.jpanelRoot = jpanelRoot;
    }

    

    public void setView(JPanel jpanelItem, JLabel jlabelItem){
        kindSelect = "TrangChu";
        jpanelItem.setBackground(new Color(77,166,255));
        jlabelItem.setBackground(new Color(77,166,255));
        
        jpanelRoot.removeAll();
        jpanelRoot.setLayout(new BorderLayout());
        JPanel node = new TrangChuJPanel();
        jpanelRoot.add(node);
        jpanelRoot.validate();
        jpanelRoot.repaint();
    }
    
    
    public void setEvent(List<Menu> menu){
        this.menu = menu;
        for (Menu item : menu) {
           item.getJlabel().addMouseListener((new LabelEvent(item.getKind(), item.getJpanel(), (JLabel) item.getJlabel())));
     }
    }

    
    
   
    
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent( String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChuJPanel();
                    break;
                case "ThemHocSinh":
                    node = new AddStudent();
                    break;
                case "NhapDiem":
                    node = new NhapDiem();
                    break;
                case "DanhSachLop":
                    node = new DanhSachLop();
                    break;
                case "TongKetMon":
                    node = new TongKetMon();
                    break;
                case "TongKetHocKy":
                    node = new TongKetHocKy();
                    break;
                case "TimKiem":
                    node = new TimKiem();
                    break;
                    
                default:
                    break;
        }
                jpanelRoot.removeAll();
                jpanelRoot.setLayout(new BorderLayout());
                jpanelRoot.add(node);
                jpanelRoot.validate();
                jpanelRoot.repaint();
                setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
           kindSelect = kind;
           jpnItem.setBackground(new Color(96, 100, 191));
           jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItem.setBackground(new Color(96, 100, 191));
        }
        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelect.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(76, 175, 80));
                jlbItem.setBackground(new Color(76, 175, 80));
          }
        }

        private void setChangeBackground(String kind) {
            for (Menu item : menu ){
                if (item.getKind().equalsIgnoreCase(kind)){
                    item.getJlabel().setBackground(new Color(96, 100, 191));
                    item.getJpanel().setBackground(new Color(96, 100, 191));
                }
                else
                    item.getJlabel().setBackground(new Color(76, 175, 80));
                    item.getJpanel().setBackground(new Color(76, 175, 80));
            }
        }
        
    }
    
    
    
}

