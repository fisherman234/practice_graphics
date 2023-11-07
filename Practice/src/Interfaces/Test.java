package Interfaces;

public class Test {

	public static void main(String[] args) {
		Animal info1 = new Animal(1);
		Person info2 = new Person("Bob");
		
		outputInfo(info1);
		outputInfo(info2);
		
	}
	
	public static void outputInfo(Info info) {
		info.showInfo();
	}
}
