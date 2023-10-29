package _05_popcorn;

import javax.swing.JOptionPane;

public class micowave {
public static void main(String[] args) {
	Microwave mic = new Microwave();
	String flavor = JOptionPane.showInputDialog(null, "what flavor of popcorn"); 
	String time = JOptionPane.showInputDialog("how many minutes");
    int time1 = Integer.parseInt(time);
	Popcorn pop = new Popcorn(flavor);
	mic.putInMicrowave(pop);
	mic.setTime(time1);
mic.startMicrowave();


}
}
