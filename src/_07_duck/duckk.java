package _07_duck;

import javax.swing.JOptionPane;

public class duckk {
	
	public int walkTime;
	String food = JOptionPane.showInputDialog("what is dogs favorite food");
	public String favoriteFood;
	public void Dog(int i, String favoriteFood) {
		this.walkTime = i;
		this.favoriteFood = food; 
	}
	
}
