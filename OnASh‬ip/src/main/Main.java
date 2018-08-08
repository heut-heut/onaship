package main;
import game.*;
import locations.Werkstatt;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main {
	
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static int screenWidth  = (int) screenSize.getWidth();
	static int screenHeight = (int) screenSize.getHeight();
	static int frameBreite  = screenWidth/2;
	static int frameHohe    = screenHeight/2;
	
	

	public static void main(String[] args) {
	
	JFrame frame = new JFrame("on a ship");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(screenWidth/2, screenHeight/2);
	frame.setLocation((screenWidth/2)-(frameBreite/2), (screenHeight/2)-(frameHohe/2));
	frame.setVisible(true);


	
	Container container = frame.getContentPane();
	container.setLayout(new BorderLayout());
	
	
	
	Model model = new Model();
	
	ZentralerController controller = new  ZentralerController(model);
	
	
	ButtonPanel buttonpanel = new ButtonPanel(model, controller, frameHohe, frameBreite);
	TextPanel textpanel = new TextPanel(model);
	StatusPanel statusPanel = new StatusPanel(model, controller);
	
	model.addPropertyChangeListener(buttonpanel);
	
	
	container.add(textpanel, BorderLayout.CENTER);
	container.add(buttonpanel, BorderLayout.SOUTH);
	container.add(statusPanel, BorderLayout.NORTH);
	
	
	model.setLocation(new Werkstatt(model));
	model.setOrtName("Werkstatt");
	model.setHealth(100);
	model.update();
	System.out.println(model.getHealth());
	}
	
	
	
	
	
}
