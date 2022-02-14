public class FruitStand {
    private Fruit[] availableFruit; // creating a private array
    private double cash; // private double for cash

    public Fruit[] getAvailableFruit() { // getter for available fruit
        return availableFruit;
    }

    public void setAvailableFruit(Fruit[] af) { //setter for available fruit
        availableFruit = af;
    }

    public double getCash() { //getter for cash
        return cash;
    }

    public void setCash(double c) { //setter for cash
        cash = c;
    }

    public int sellFruit(String name, int amount) {
        int myStock = 0;
        double price = 0;
        //iterate through available fruit
        for (int i = 0; i < availableFruit.length; i++) {
            Fruit currentFruit = availableFruit[i];
            if (name.equals(currentFruit.name())) {
                price = currentFruit.getPricePerUnit();
                // we found our fruit
                if (currentFruit.getStock() + myStock >= amount) {
                    // we sold the full amount and are going to stop looping
                    currentFruit.setStock(currentFruit.getStock() - (amount - myStock));
                    // update cash
                    double profit = amount * price;
                    setCash(getCash() + profit);
                    return 0;
                } else {
                    myStock += currentFruit.getStock();
                    currentFruit.setStock(0);
                }
            }
        }
        // update cash
        double profit = myStock * price;
        setCash(getCash() + profit);
        return amount - myStock;
    }

    public double restock(int[] units) {
        double cost = 0;
        setCash(0);
        for (int i = 0; i < availableFruit.length; i++){
            Fruit currentFruit = availableFruit[i];
            int desiredUnits = units[i];
            if (currentFruit.getFreshUntil() < 1) {
                cost += desiredUnits * currentFruit.getPricePerUnit() * FruitWarehouse.BULK_RATE;
                currentFruit.setStock(desiredUnits);
            }
            if ( currentFruit.getStock() < desiredUnits){
                int buy = desiredUnits - currentFruit.getStock();
                cost += buy * currentFruit.getPricePerUnit() * FruitWarehouse.BULK_RATE;
                currentFruit.setStock(desiredUnits);
            }
        }
        return cost;
    }


}