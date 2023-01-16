package ood_intro;

public class into{

	public static void main(String[] args) {
		
		
		Human human1 = new Human(22,69);
		Human human2 = new Human();
		Human human3 = new Human(25);
		
		System.out.println("Human 1");
		System.out.println("Age:" + human1.age);
		System.out.println("Weight:" + human1.weight);
		human1.eat();
		human1.sleep();
		
		System.out.println("Human 2");
		System.out.println("Age:" + human2.age);
		System.out.println("Weight:" + human2.weight);
		human2.eat();
		human2.sleep();
		
		System.out.println("Human 3");
		System.out.println("Age:" + human3.age);
		System.out.println("Weight:" + human3.weight);
		human3.eat();
		human3.sleep();
		
		System.out.println("Count: " + Human.count);
		
		
	}
}

class Human{
	
	static int count = 0;
	//properties
	int age;
	int weight;
	
	//No args constructor
	public Human(){
		count++;
		age = 22;
		weight = 60;
		System.out.println("Inside No args constructor");
	}
	
	
	//parameterized constructor
	public Human(int age, int weight){
		count++;
		this.age = age;
		this.weight = weight;
		System.out.println("Inside Parameterized constructor");
	}

	//constructor overloading
	public Human(int age){
		count++;
		System.out.println("Inside Age constructor");
		this.age = age;
	}
	
	//behaviour
	void sleep(){
		System.out.println("Sleeping...");
	}
	
	void eat(){
		System.out.println("Eating...");
	}
	
	static void update(){
		count++;
	}
}
