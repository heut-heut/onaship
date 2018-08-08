package game;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import locations.Location;
import locations.Werkstatt;

public class Model{

	private PropertyChangeSupport support = new PropertyChangeSupport(this);
	
	
	private String  Text;
	private String  B1Text;
	private String  B2Text;
	private String  B3Text;
	private String  B4Text;
	
	private Integer health;
	private String  ortName;
	
	private Location loc;
	

	
	
	public Model() {

//		modelUpdate();		
	}

	
	
	

	
//	public void modelUpdate() {
//		Text = loc.getText(); 
//		Ort = loc.getName();
//		B1Text = loc.getB1Text();
//		B2Text = loc.getB2Text();
//		B3Text = loc.getB3Text();
//		B4Text = loc.getB4Text();
//		
//
//		support.firePropertyChange("MODEL_UPDATE",1111,2222);
//	}
	
	public void update() {
		System.out.println("UPDATE");
		support.firePropertyChange("MODEL_UPDATE", 1111, 2222);
	}
	
	
	

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}

	public void firePropertyChange(PropertyChangeEvent PCEvent) {
		support.firePropertyChange(PCEvent);
	}

	
	public String getB1Text() {
		return B1Text;
	}
	public String getB2Text() {
		return B2Text;
	}
	public String getB3Text() {
		return B3Text;
	}
	public String getB4Text() {
		return B4Text;
	}
	public void setB1Text(String b1Text) {
		B1Text = b1Text;
		update();
	}
	public void setB2Text(String b2Text) {
		B2Text = b2Text;
		System.out.println(b2Text);
		update();
	}
	public void setB3Text(String b3Text) {
		B3Text = b3Text;
	}
	public void setB4Text(String b4Text) {
		B4Text = b4Text;
	}
	

	

	
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}


	
	
	
	public void setText(String text) {
		this.Text = text;
		support.firePropertyChange("MODEL_UPDATE", this.Text, text);
	}
	public String getText() {
		return Text;
	}
	




	public String getOrtName() {
		return ortName;
	}
	public void setOrtName(String ortName) {
		ortName = ortName;
		support.firePropertyChange("MODEL_UPDATE", this.ortName, ortName);

	}




	public Integer getHealth() {
		return health;
	}
	public void setHealth(Integer health) {
		System.out.println("SET HEALTH");
		this.health = health;
		update();
		
	}
	
	

	
	
	public void setLocation(Location loc) {
		this.loc = loc;
	}
	public Location getLocation() {
		return loc;
	}
	
}
