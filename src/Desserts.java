
class Desserts extends Stock {
	private boolean cream;
	private boolean cake;

	public boolean isCream() {
		return cream;
	}

	public void setCream(boolean cream) {
		this.cream = cream;
	}

	public boolean isCake() {
		return cake;
	}

	public void setCake(boolean cake) {
		this.cake = cake;
	}

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
