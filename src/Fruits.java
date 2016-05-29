
class Fruits extends Stock {
	boolean sweet;
	String color;

	public Fruits(float price, boolean availability, boolean sweet, String color) {
		super(price, availability);
		this.sweet = sweet;
		this.color = color;
	}

	public void fruit() {
		System.out.println("Is the fruit sweet? " + this.sweet);
		System.out.println("Color:  " + this.color);
		System.out.println();
	}
}
