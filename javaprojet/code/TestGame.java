package code;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class TestGame extends JFrame {

    public TestGame() {

        initUI();
    }

    private void initUI() {

        add(new Board());
        setTitle("Ilyes et Hayder Projet");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var game = new TestGame();
            game.setVisible(true);
        });
    }
}
