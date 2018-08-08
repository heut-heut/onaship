package locations;

import game.Model;

public class Location {

	
	Model model;
	
	String Name   = "";

	String B1Text = "";
	String B2Text = "";
	String B3Text = "";
	String B4Text = "";

	String Text   = "";

	
	
	public Location(Model model) {
		this.model = model;
	}
	
	
	public Location(Model model, String name, String b1Text, String b2Text, String b3Text, String b4Text, String text) {
		this.Name = name;
		this.B1Text = b1Text;
		this.B2Text = b2Text;
		this.B3Text = b3Text;
		this.B4Text = b4Text;
		this.Text = text;
	}
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public String getB1Text() {
		return B1Text;
	}
	public void setB1Text(String b1Text) {
		B1Text = b1Text;
	}

	public String getB2Text() {
		return B2Text;
	}
	public void setB2Text(String b2Text) {
		B2Text = b2Text;
	}

	public String getB3Text() {
		return B3Text;
	}
	public void setB3Text(String b3Text) {
		B3Text = b3Text;
	}

	public String getB4Text() {
		return B4Text;
	}
	public void setB4Text(String b4Text) {
		B4Text = b4Text;
	}
	
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}

	
	
	public void actionB1() {
	}
	
	
	
	
}
