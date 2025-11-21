import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;
        
        JFrame frame = new JFrame("Flappy Ufo");
        // frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyUfo flappyUfo = new FlappyUfo();
        frame.add(flappyUfo);
       // excluded header 
        frame.pack();
        flappyUfo.requestFocus();
        frame.setVisible(true);

    }
}
