import javax.swing.*;
import java.awt.*;

public class MainUI {

    public MainUI(){
        JFrame appFrame = new JFrame("Button Counter");
        appFrame.add(getPane());
        appFrame.setSize(200,200);
        appFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        appFrame.setVisible(true);
    }

    private JPanel getPane() {
        JPanel appPanel = new JPanel();
        JButton appButton = new JButton("Click Me!");

        return appPanel;
    }

    public static void  main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainUI();
            }
        });
    }
}
