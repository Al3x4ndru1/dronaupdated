package drona.zbor;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class mapViewerworldComponent extends JComponent {
    BufferedImage image;
    mapViewerworldComponent(File s){
        try {
            this.image = ImageIO.read(s);
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error 404");
        }
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.create();
        int  margin=1;
        g.drawImage(this.image,margin,margin,this.image.getWidth(),this.image.getHeight(),this);
    }
}
