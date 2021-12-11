package drona.zbor.Cities;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class London extends JComponent {
    BufferedImage london=null;
    File londra=new File("/home/al3x4ndru1/drona");
    public London(){
try {
    this.london = ImageIO.read(londra);
    if(london==null){
        throw new IOException();
    }
}
catch (IOException e){
    JOptionPane.showMessageDialog(null,"The map can not be load it");
}
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.create();
        int margin=1;
        g.drawImage(this.london,margin,margin,this.london.getWidth(),this.london.getHeight(),this);

    }
}
