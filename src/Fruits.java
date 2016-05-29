
class Fruits extends Stock {
	public boolean isSweet() {
		return sweet;
	}

	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

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
