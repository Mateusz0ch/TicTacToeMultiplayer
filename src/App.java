import javax.swing.*;

public class App extends JFrame {
    private static int WIDTH = 500,HEIGHT=500;
    JLabel label;
    public App(){
        configureFrame();
        addLabelStart();
        addComponents();
        getContentPane().add(label);
    }
    private void configureFrame(){
        setTitle("Tic Tac Toe Online");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
    }
    private void addComponents(){
        getContentPane().add(label);
    }
    private void addLabelStart(){
        label = new JLabel();
        label.setText("Hello in Tic tac toe online!!!");
        label.setBounds(150,0,300,50);
    }

}
