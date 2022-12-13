package _07_duck;

public class Runner {
public static void main(String[] args) {
	Duck duck = new Duck("duck food", 12);
	duck.quack();
	duck.waddle();
	Puppy pup = new Puppy("dog food", "Pup");
	pup.bark();
	pup.fetch();
}
}
