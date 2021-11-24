package drona.zbor;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;


public class mapViewerworld implements Serializable, ActionListener {
	BufferedImage mapaa;
	ImageIcon mapa= new ImageIcon("world-map.png");
	File mapaf=new File("world-map.png");
	JButton switchb = new JButton("Switch");
	JList<String> countries = new JList<String>();

	JPanel panel = new JPanel();
	JFrame frame = new JFrame();

	 public mapViewerworld(){
		 frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 frame.setTitle("Map Viewer");
		 JLabel img = new JLabel("",mapa,JLabel.CENTER);
		 panel.add(img);
		 panel.add(switchb);
		 switchb.addActionListener(new ActionListener() {
			 @Override
			 public void actionPerformed(ActionEvent actionEvent) {
				 mapViewerworldComponent a = new mapViewerworldComponent(mapaf);
				 JOptionPane.
				 panel.add(a);
				 frame.add(panel);
				 frame.pack();

			 }
		 });

		 frame.add(panel);
		 frame.pack();
		 frame.setVisible(true);

	}


	@Override
	public void actionPerformed(ActionEvent actionEvent) {

	}
}