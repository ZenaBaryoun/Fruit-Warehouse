public class Banana extends Fruit {
	public Banana(int stock) { 
		super(FruitWarehouse.bananaPricePerUnit, stock, FruitWarehouse.BANANA_FRESH_DAYS); // calling parent class and passing it through fruitwarehouse
	}
	public String name() { // returns a string 
		return "Banana";
	}
	public String getUnits() { // returns a string 
		return "bunch";
	}
}