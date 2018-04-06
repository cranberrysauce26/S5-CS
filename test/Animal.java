public class Animal implements Talkable, Mortal {

	int age;
	String name;

	Animal() {
		name = "Undefined";
		age = 0;
	}

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void speak() {
		System.out.printf("This is a generic animal sound\n");
	}

	public void shout() {
		System.out.printf("I am shouting\n");
	}

	public void birth() {
		System.out.printf("I am being born\n");
	}

	public void die() {
		System.out.printf("I am dying\n");
	}
}