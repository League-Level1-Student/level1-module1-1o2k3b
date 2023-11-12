package _07_duck;

import java.util.Random;

import javax.swing.JOptionPane;

public class duckfood {
public static void main(String[] args) {
	
	Random ran = new Random();
	duckk dog = new duckk();
	dog.Dog(ran.nextInt(999999999), dog.food);
	System.out.println(dog.walkTime + " minutes of walk time and "  + "he eats only " + dog.favoriteFood);
}
}
