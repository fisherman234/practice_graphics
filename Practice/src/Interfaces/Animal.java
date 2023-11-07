package Interfaces;

public class Animal implements Info{
	public int id;
	
	public Animal(int id) {
		this.id = id;
	}
	
	public void sayHello() {
		System.out.println("Do animals talk?");
	}

	@Override
	public void showInfo() {
		System.out.println("Info: "+this.id);
	}
}
