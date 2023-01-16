package ood_intro;

public class encapsulation {
	public static void main(String[] args) {
		People obj = new People();
		obj.setAge(23);
		obj.setWeight(63);
		System.out.println(obj.getAge());
		System.out.println(obj.getWeight());
	}
}

class People{
	 private int age;
	 private int weight;
	 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
