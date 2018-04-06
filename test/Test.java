
public class Test {
	public static void main(String[] args) {
		Mortal m = new Dog();
		m.die();
		Talkable t = (Talkable) m;
		t.shout();
	}
}