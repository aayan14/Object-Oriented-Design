package ood_intro;

public class interfaces {

	public static void main(String[] args) {
		
	}
}

interface Father{
	
	public void speak();
	public void walk();
}

interface Mother{
	public void shout();
	public void run();
}

class Child implements Father, Mother{

	@Override
	public void shout() {
		System.out.println("Shouting...");
	}

	@Override
	public void run() {
		System.out.println("Running....");
	}

	@Override
	public void speak() {
		System.out.println("Speaking...");
	}

	@Override
	public void walk() {
		System.out.println("Walking...");
	}
	
	
}