package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import locations.Location;

public class ZentralerController implements ActionListener{

	
	Model model;
	
	public ZentralerController(Model model) {
		this.model = model;
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String cmd = event.getActionCommand();
		switch(cmd) {
		case "B1":
			System.out.println("b1");
			Location location = model.getLocation();
			location.actionB1();
			break;
		case "B2":
			System.out.println("b2");
			break;
		case "B3":
			System.out.println("b3");
			break;
		case "B4":
			System.out.println("b4");
			break;
		case "MENU":
			System.out.println("menu");
			break;
		case "INVENTAR":
			System.out.println("inventar");
			break;
		}
		model.setText("Platzhalter ActionEvent");		
	}

}
