public class Watermelon extends Fruit {
	public Watermelon(int stock) {
		// calling parent class and passing values through fruitwarehouse
		super(FruitWarehouse.watermelonPricePerUnit, stock, FruitWarehouse.WATERMELON_FRESH_DAYS);
	}
	public String name() { //returns string 
		return "Watermelon";
	}
}