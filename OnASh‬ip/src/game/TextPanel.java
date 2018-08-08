package game;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextPanel extends JPanel implements PropertyChangeListener{
	
	Model model;
	JLabel textLabel;
	String text;
	
	
	public TextPanel(Model model){
		this.model = model;
		textLabel = new JLabel(model.getText());
		
	}

	
	
	
	
	
	@Override
	public void propertyChange(PropertyChangeEvent PCEvent) {
		String cmd = PCEvent.getPropertyName();
		
		if(cmd.equals("MODEL_UPDATE")) {
			System.out.println("textpanel: propertychange angekommen");
			textLabel.setText(model.getText());
			
		}	
	}
	
	
	
	public void setText(String text) {
		textLabel.setText(text);
	}
	public String getText() {
		return textLabel.getText();
	}
	
	
	

}
