
class Drinks extends Stock {

	public boolean isCold() {
		return cold;
	}

	public void setCold(boolean cold) {
		this.cold = cold;
	}

	public boolean isHot() {
		return hot;
	}

	public void setHot(boolean hot) {
		this.hot = hot;
	}

	boolean cold;
	boolean hot;

	public Drinks(float price, boolean availability, boolean cold, boolean hot) {
		super(price, availability);
		this.cold = cold;
		this.hot = hot;
	}

	public void drink() {
		System.out.println("Cold drinks " + this.cold);
		System.out.println("Hot drinks " + this.hot);
		System.out.println();
	}
}
