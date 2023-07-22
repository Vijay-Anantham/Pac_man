// TODO : Make window and display obstacles
import java.awt.Color;

import javax.swing.*;

public class Pacman{
    public static void main(String[] args) {
        // Create a new JFrame (window) instance
        JFrame frame = new JFrame("PACMAN");

        // Set the size of the window (width, height) in pixels
        frame.setSize(600, 800);
        frame.getContentPane().setBackground(Color.BLACK);

        // Set the default close operation (when clicking the 'X' button)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the window to be visible
        frame.setVisible(true);
    }
}