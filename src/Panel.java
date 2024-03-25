import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    JLabel label;
    JLabel status;
    JButton connect;
    JTextField inputAddress;
    boolean connected = false;
    public Panel(){
        setLayout(null);
        setLabel();
        setConnectButton();
        setInputAddress();
        add(label);
        add(status);
        add(connect);
        add(inputAddress);
        setStatus(false);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawMap(g);
    }
    void setLabel(){
        label = new JLabel("Hello player!");
        label.setBounds(100,0,100,20);
        status = new JLabel("Status: ");
        status.setBounds(350,0,150,20);

    }
    void setConnectButton(){
        connect = new JButton("Connect");
        connect.setBounds(250,400,100,20);
        connect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = inputAddress.getText();
                status.setText("Status: connected");
                status.setForeground(Color.GREEN);
                System.out.println(temp);
            }
        });

    }
    void setInputAddress(){
        inputAddress = new JTextField();
        inputAddress.setBounds(100,400,100,20);
    }
    public void setStatus(boolean val){
        connected = val;
        if(connected){
            status.setText("Status: connected");
            status.setForeground(Color.GREEN);
        }else{
            status.setText("Status: offline");
            status.setForeground(Color.BLACK);
        }
    }
    void drawMap(Graphics g){
        int x=50,y=100;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                x+=75;
                g.drawRect(x,y,75,75);
            }
            y+=75;
            x=50;
        }
    }
}
