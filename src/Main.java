import java.util.Vector;

class Stock {

	@Override
	public String toString() {
		return "Stock [price=" + price + ", availability=" + availability + "]";
	}

	private float price;
	private boolean availability;

	public Stock(float price, boolean availability) {
		super();
		this.price = price;
		this.availability = availability;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public void all() {
		System.out.println("Price is " + this.price);
		System.out.println("Availability " + this.availability);
	}
}

class Store {
	private String address;
	private String name;
	private Vector<Stock> stocks = new Vector<Stock>();

	public Store(String address, String name) {
		super();
		this.address = address;
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Store() {
		this("", "");
	}

	public void store() {
		System.out.println("Store address is: " + this.address);
		System.out.println("Store name is: " + this.name);
	}

	public void add(Stock stock) {
		stocks.add(stock);
	}
}

public class Main {

	public static void main(String[] args) {
		Meat chicken = new Meat(9, true, "Chicken", 2);
		chicken.all();
		chicken.food();
		Vegetables potatoes = new Vegetables(3, true, true, false);
		potatoes.all();
		potatoes.vegs();
		Fruits apple = new Fruits(1, false, false, "green");
		apple.all();
		apple.fruit();

		Drinks coffee = new Drinks(2, true, false, true);
		coffee.all();
		coffee.drink();
		Desserts brulee = new Desserts(4, true, true, false);
		brulee.all();
		brulee.dessert();

	}
}
