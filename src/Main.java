class Stock {

	@Override
	public String toString() {
		return "Stock [price=" + price + ", availability=" + availability + "]";
	}

	private float price;
	boolean availability;

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
	public void all(){
		System.out.println("Price is " + this.price);
		System.out.println("Availability " + this.availability);
	}
}

public class Main {

	public static void main(String[] args) {
		Meat chicken = new Meat (9,true,"Chicken", 2);
		chicken.all();
		chicken.food();
		Vegetables potatoes = new Vegetables (3,true,true,false);
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
