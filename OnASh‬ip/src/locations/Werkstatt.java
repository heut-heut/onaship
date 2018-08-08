package locations;

import game.Model;

public class Werkstatt extends Location{
	
	
	static Model model;
	
	static String Name   = "Werkstatt";

	static String B1Text = "Gehe durch die rote t�r";
	static String B2Text = "Gehe durch die blaue t�r";
	static String B3Text = "-";
	static String B4Text = "-";
	
	

	static String Text   = "Willkommen in der Werkstatt. Es ist ein dreckiger, kleiner und dunkler Raum. du siehts eine rote und eine blaue t�r. Was willst du tun?";

	
	
	public Werkstatt(Model model) {
		super(model);
	}
	
	
	public Werkstatt() {
		super(model, Name, B1Text, B2Text, B3Text, B4Text, Text);
	}

	
	
	@Override
	public void actionB1() {
		System.out.println("ACTION!!!");
		model.setHealth(80);}
	
	
	
	
	
	
	
	
	
	
	

}
