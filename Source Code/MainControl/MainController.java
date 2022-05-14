// lớp quản lý hiển thị màn hình (main)

package MainControl;

import View.Main;
import main.java.login.UserLogin;

import java.awt.*;

/**
 *
 * @author Admin
 */
public class MainController {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserLogin frame = new UserLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

