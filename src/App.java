import javax.swing.*;
import java.awt.*;

public class App{
    private static int WIDTH = 500,HEIGHT=500;
    JFrame frame;
    public App(){
        frame = new JFrame();
        frame.add(new Panel());
        configureFrame();
    }
    private void configureFrame(){
        frame.setTitle("Tic Tac Toe Online");
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
    }

}
