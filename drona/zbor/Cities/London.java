package drona.zbor.Cities;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class London {
    public London(){
        main();
    }

    public static void main(){
        JFrame F = new JFrame("Londom map right now");
        JPanel p =new JPanel();
        JLabel img;
        ImageIcon Lonmap = new ImageIcon("Londom-Map.png");
        F.setSize(450,450);
        F.setLocation(400,400);
        img = new JLabel("",Lonmap,JLabel.CENTER);
        img.setBounds(0, 0, 450, 450);
        F.add(img);
        F.setVisible(true);

    }
}
