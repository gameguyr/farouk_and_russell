package learningHeadFirstJava.learningGUI;
////////////////////////
// TITLE: SimpleGuiOneButton
// AUTHOR: russell lego
// DATE: 2019-04-22
// PURPOSE: To have a GUI that has a button and a frame.
// Eventually I will have it so that when the user clicks on the button,
// The color will change for the circles being drawn in the panel.
////////////////////////

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiOneButton implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGuiOneButton myGui = new SimpleGuiOneButton();
        myGui.startGui();
    }

    private void startGui() {

        frame = new JFrame();

        // making and adding the button to the frame
        Button button = new Button("Click Me to Change Color");
        button.addActionListener(this);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        // making and adding the panel to the frame
        DrawRandomGradientCirclePanel panel = new DrawRandomGradientCirclePanel();
        frame.getContentPane().add(BorderLayout.CENTER, panel);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1600, 900);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        this.frame.repaint();
        // this was the part that I couldn't get.
    }
}
