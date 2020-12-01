import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class MainUI {

    private int clicks =0;

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
        JTextArea appText  = new JTextArea(clicks+"");
        appButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicks +=1;
                appText.setText(clicks+"");
            }
        });

        appPanel.add(appText);
        appPanel.add(appButton);
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
