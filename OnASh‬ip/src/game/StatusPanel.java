package game;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusPanel extends JPanel implements PropertyChangeListener{

	Model model;
	ZentralerController controller;
	JButton menuButton;
	JButton inventarButton;
	JLabel  healthLabel;
	JLabel  ort;
	static String ORT = "Ort: ";
	static String HEALTH = "Leben: ";
	
	
	
	
	public StatusPanel(Model model, ZentralerController controller) {
		this.model = model;
		this.controller = controller;
		
		buttonInitialisieren();		
	}
	
	
	
	private void buttonInitialisieren() {
		ort            = new JLabel(ORT + model.getOrtName());
		menuButton     = new JButton("Menu");
		inventarButton = new JButton("Inventar");
		healthLabel    = new JLabel(HEALTH + model.getHealth() );
		
		
		menuButton.setActionCommand("MENU");
		inventarButton.setActionCommand("INVENTAR");
		
		
		menuButton.addActionListener(controller);
		inventarButton.addActionListener(controller);
		
		
		this.add(menuButton);
		this.add(inventarButton);
		this.add(healthLabel);
		this.add(ort);
			
		
	}
	
	
	
	
	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		System.out.println("statuspanel: propertychange angekommen");
		healthLabel.setText(HEALTH + model.getHealth());
		
	}

}
