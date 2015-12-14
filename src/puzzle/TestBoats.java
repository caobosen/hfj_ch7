package puzzle;

public class TestBoats {

	public static void main(String[] args) {
		Boat b1 = new Boat();
		Sailbaot b2 = new Sailbaot();
		Rowboat b3 = new Rowboat();

		b2.setLength(32);
		b1.move();
		b3.move();
		b2.move();

	}

}
