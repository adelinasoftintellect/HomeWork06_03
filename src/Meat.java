
class Meat extends Stock {
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getKilos() {
		return kilos;
	}

	public void setKilos(int kilos) {
		this.kilos = kilos;
	}

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
