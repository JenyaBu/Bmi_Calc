import sun.security.mscapi.CPublicKey;

import java.awt.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame ("BMI_Calculate   MainPanel     Today: "+ LocalDate.now());
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        MainPanel panel = new MainPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        frame.getContentPane().add(panel);
       // frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

    }



}


