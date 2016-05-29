
class Vegetables extends Stock {
	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public boolean isCanned() {
		return canned;
	}

	public void setCanned(boolean canned) {
		this.canned = canned;
	}

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
