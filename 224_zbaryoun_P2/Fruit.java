public class Fruit {

    private double pricePerUnit; //private double that holds the price per unit of this fruit

    private int stock; //private integer that holds the number of units of this fruit in stock

    private int freshUntil; //private integer that holds the number of days this stock of fruit will remain fresh until

    public Fruit(double pricePerUnit, int stock, int freshUntil) { //constructor with 3 parameters. Initializes private data members using setter
        this.pricePerUnit = pricePerUnit;
        setStock(stock);
        setFreshUntil(freshUntil);

    }

    public double getPricePerUnit() { //getter for pricePerUnit
        return pricePerUnit;
    }

    public int getStock() { //getter for stock
        return stock;
    }

    public void setStock(int num) { //setter for stock
        stock = num;
    }

    public int getFreshUntil() { //getter for freshUntil
        return freshUntil;
    }

    public void setFreshUntil(int num) { //setter for freshUntil
        freshUntil = num;
    }

    public String getUnits() { //returns strong "pounds"
        return "pounds";
    }

    public String name() { // returns string "Fruit"
        return "Fruit";
    }

    public String toString() {
        return "[" + name() + ": " + "pricePerUnit=" + pricePerUnit + ", stock=" + stock + ", freshUntil=" + freshUntil + ", units=" + getUnits() + "]";  // returning string representation of fruit

    }

}