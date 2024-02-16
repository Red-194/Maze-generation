package Recursive_Backtracking;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main{

    JFrame frame;
    JPanel panel;
    
    public static void main(String args[]){
        new Main();
    }

    Main(){

        frame = new JFrame("Maze");
        frame.setSize(new Dimension(400, 400));
        frame.setResizable(false);
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 400));
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

