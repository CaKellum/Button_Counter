import javax.swing.*;
import java.awt.*;

public class MainUI {

    private int clicks =0;

    public MainUI(){
        JFrame appFrame = new JFrame("Button Counter");
        appFrame.add(getPane());
        appFrame.setSize(400,200);
        appFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        appFrame.setVisible(true);
    }

    private JPanel getPane() {
        JPanel appPanel = new JPanel(new BorderLayout());
        JPanel widgetPanel = new JPanel();
        BoxLayout widgetLayout = new BoxLayout(widgetPanel, BoxLayout.Y_AXIS);
        widgetPanel.setLayout(widgetLayout);
        JButton appButton = new JButton("Click Me!");
        JLabel appText = new JLabel(clicks+"");

        appText.setHorizontalAlignment(SwingConstants.CENTER);
        appText.setVerticalAlignment(SwingConstants.CENTER);

        appButton.setVerticalAlignment(SwingConstants.CENTER);
        appButton.setHorizontalAlignment(SwingConstants.CENTER);
        appButton.addActionListener(e -> {
            clicks +=1;
            if(clicks ==100){
                clicks = 0;
            }
            appText.setText(clicks+"");
        });

        widgetPanel.add(appText);
        widgetPanel.add(appButton);
        appPanel.add(widgetPanel,BorderLayout.CENTER);
        return appPanel;
    }

    public static void  main(String[] args){
        SwingUtilities.invokeLater(MainUI::new);
    }
}
