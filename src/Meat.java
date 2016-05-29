
class Meat extends Stock {
	String type;
	int kilos;

	public Meat(float price, boolean availability, String type, int kilos) {
		super(price, availability);
		this.type = type;
		this.kilos = kilos;
	}

	public void food() {
		System.out.println("The type of the meat is: " + this.type);
		System.out.println("Kilos: " + this.kilos);
		System.out.println();
	}

}
