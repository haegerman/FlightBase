package se.lexicon.model.priceConstruction;

public class Price {

    private double seatPrice;
    private  double foodPrice;
    private double beveragePrice;
    private double totalPrice;

    public Price(double seatPrice, double foodPrice, double beveragePrice) {
        this.seatPrice = seatPrice;
        this.foodPrice = foodPrice;
        this.beveragePrice = beveragePrice;
        this.totalPrice = seatPrice + foodPrice + beveragePrice;
    }

    public double getSeatPrice() {
        return seatPrice;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public double getBeveragePrice() {
        return beveragePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
