package cat.mvm.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {
    public MyFrame(){
        this.setSize(500,300);
        this.setLocation(500,300);
        this.setBounds(500,300, 550,250);//setLocation+setSize
        this.setResizable(false);//ni redimensionar ni maximizar
        this.setExtendedState(Frame.MAXIMIZED_BOTH);*

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

        //Creem els botons
        JPanel buttons = new JPanel();
        JButton hello = new JButton("Digues Hola");
        JButton bye = new JButton("Digues Adeu");
        buttons.add(hello);
        buttons.add(bye);

        //Creem el camp de text
        JTextField txtOut = new JTextField("Pulsa un botó");

        //Afegim els listeners als components
        hello.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ev) {
                        txtOut.setText("Hola!");

                    }});
        bye.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ev) {
                        txtOut.setText("Adeu!!!!");

                    }});

        JSplitPane mainPanel =
                new JSplitPane(JSplitPane.VERTICAL_SPLIT,buttons,txtOut);
        getContentPane().add(mainPanel);

        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent ev) {
                        System.exit(0);
                    }
                });

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
