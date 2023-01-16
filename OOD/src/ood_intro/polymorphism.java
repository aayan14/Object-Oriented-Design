package ood_intro;

public class polymorphism {
	public static void main(String[] args) {
		
		Calculator calc1 = new Calculator();
		calc1.add(6);
		calc1.add(6,5);
		calc1.add(6,5,4);
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animal.speak();
		dog.speak();
		cat.speak();
	}
}


class Calculator{
	
	int a;
	int b;
	int c;
	int res;
	
	
	// Function Overloading (Compile Time Polymorphism)
	void add(int a){
		res = a + 1;
		System.out.println(res);
	}
	void add(int a, int b, int c){
		res = a + b + c;
		System.out.println(res);
	}
	void add(int a, int b){
		res = a + b;
		System.out.println(res);
	}
}

class Animal{
	
	void speak(){
		System.out.println("Haayee!!");
	}
}

class Dog extends Animal{
	 
	void speak(){
		System.out.println("Woff!!");
	}
}

class Cat extends Animal{
	 
	void speak(){
		System.out.println("Meoww!!");
	}
}


