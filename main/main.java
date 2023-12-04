package main;

import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Simple Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        // add GamePanel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();
        //pack = size

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.launchGame();
    }

}
