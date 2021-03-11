package cat.mvm.graphics;

import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        /*this.setSize(500,300);
        this.setLocation(500,300);
        this.setBounds(500,300, 550,250);//setLocation+setSize
        this.setResizable(false);//ni redimensionar ni maximizar
        this.setExtendedState(Frame.MAXIMIZED_BOTH);*/

        //<editor-fold desc="Centrar frame">
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth/2, screenHeight/2);
        setLocation(screenWidth/4, screenHeight/4);
        //</editor-fold>

        this.setTitle("La meva finestra");
        Image myIcon = screen.getImage("src/cat/mvm/graphics/icon.gif");
        setIconImage(myIcon);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
