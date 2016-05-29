
class Vegetables extends Stock {
	boolean fresh;
	boolean canned;

	public Vegetables(float price, boolean availability, boolean fresh, boolean canned) {
		super(price, availability);
		this.fresh = fresh;
		this.canned = canned;
	}

	public void vegs() {

		System.out.println("Vegetebles are fresh: " + this.fresh);
		System.out.println("Vegetebles are canned " + this.canned);
		System.out.println();
	}
}
