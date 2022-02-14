
public class FruitEmporium {
	private FruitStand[] stands; // a private array of fruitstand


	FruitEmporium(FruitStand[] s) { //constructor that takes fruit stand array
		setStands(s); //setter for stands
	}

	public FruitStand[] getStands() { //getter for stands array
		return stands;
	}
	public void setStands(FruitStand[] s) { //setter for stands array
		stands = s;
	}
	public double totalCash() {
		double sumOfCash = 0;
		for (int i = 0; i < stands.length; i++) { //iterating through fruit stand array
			sumOfCash += stands[i].getCash(); //getter for cash and making it equal the sum of all cash
		}
		return sumOfCash;
	}

	public double restockAllStands(int level) {
		// initialize cost
		double cost = 0;
		// loop over stands
		for (FruitStand stand : stands){
			// prep integer array with i as element for length of availablefruits in stand
			int numAvailableFruits = stand.getAvailableFruit().length;
			int[] stockLevels = new int[numAvailableFruits];
			for (int i =0; i < numAvailableFruits; i++){
				stockLevels[i] = level;
			}
			cost += stand.restock(stockLevels);
		}
		return cost;
	}
	public int sellFruit(String name, int amount) {
		int leftover = amount;
		//iterating through fruit stand array and returning leftover
		for (int i = 0; i < stands.length && leftover > 0; i++) {
			leftover = stands[i].sellFruit(name, leftover);
		}
		return leftover;
	}
}