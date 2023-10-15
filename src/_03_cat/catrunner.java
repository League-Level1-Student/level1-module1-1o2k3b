package _03_cat;

public class catrunner {
public static void main(String[] args) {
	Cat cat = new Cat("catt");
	cat.meow();
	cat.printName();
	for(int i = 0; i<9; i++) {
		cat.kill();
	}

}
}
