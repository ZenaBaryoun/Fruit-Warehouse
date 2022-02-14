public class Pineapple extends Fruit {
    public Pineapple(int stock) {
        super(FruitWarehouse.pineapplePricePerUnit, stock, FruitWarehouse.PINEAPPLE_FRESH_DAYS); // calling a parent class and passing values from fruitwarehouse
    }

    public String name() { //return a string
        return "Pineapple";
    }

    public String getUnits() { //return a string
        return "item";
    }
}