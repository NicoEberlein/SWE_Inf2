package de.eberln.swe.ab3;

public class Controller {

	private View view;
	private Model model;
	
	public Controller() {
		view = new View();
		model = new Model();
		
		int erg = model.quadrieren(view.readInt());
		view.print(erg + "");
	}
	
}
