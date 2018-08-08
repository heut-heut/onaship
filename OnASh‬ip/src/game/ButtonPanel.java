package game;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel implements PropertyChangeListener {
	
	
	Model model;
	ZentralerController controller;
	JButton B1;
	JButton B2;
	JButton B3;
	JButton B4;
	int frameHohe;
	int frameBreite;
	
	
	public ButtonPanel(Model model, ZentralerController controller, int frameHohe, int frameBreite) {
		this.model = model;
		this.controller = controller;
		this.frameHohe = frameHohe;
		this.frameBreite = frameBreite;
		
		buttonInitialisierung();
		this.setPreferredSize(new Dimension(frameBreite, frameHohe/3));
	}


	private void buttonInitialisierung() {
		
		B1 = new JButton(model.getB1Text());
		B2 = new JButton(model.getB2Text());
		B3 = new JButton(model.getB3Text());
		B4 = new JButton(model.getB4Text());
		
		B1.setActionCommand("B1");
		B2.setActionCommand("B2");
		B3.setActionCommand("B3");
		B4.setActionCommand("B4");
		
		B1.addActionListener(controller);
		B2.addActionListener(controller);
		B3.addActionListener(controller);
		B4.addActionListener(controller);
		
		this.add(B1);
		this.add(B2);
		this.add(B3);
		this.add(B4);
		
		this.setLayout(new GridLayout(2, 2));
		
	}


	@Override
	public void propertyChange(PropertyChangeEvent PCEvent) {
		this.B1.setText(model.getB1Text());
		this.B2.setText(model.getB2Text());
		this.B3.setText(model.getB3Text());
		this.B4.setText(model.getB4Text());
	}
	
	
	
	public void setB1Text(String text) {
		B1.setText(text);
	}
	public void setB2Text(String text) {
		B2.setText(text);
	}
	public void setB3Text(String text) {
		B3.setText(text);
	}
	public void setB4Text(String text) {
		B4.setText(text);
	}
	
	
	
	
	

}
