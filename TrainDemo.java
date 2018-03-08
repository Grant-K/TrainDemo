import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
public class TrainDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Train Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);
        frame.add(new TrainCanvas());
        frame.setVisible(true);
    }

}

