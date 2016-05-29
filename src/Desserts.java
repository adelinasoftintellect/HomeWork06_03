
class Desserts extends Stock {
	boolean cream;
	boolean cake;

	public Desserts(float price, boolean availability, boolean cream, boolean cake) {
		super(price, availability);
		this.cream = cream;
		this.cake = cake;
	}

	public void dessert() {
		System.out.println("Is it with cream? " + this.cream);
		System.out.println("Is it cake?  " + this.cake);
		System.out.println();
	}
}
