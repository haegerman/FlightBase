package se.lexicon.model.priceConstruction;

import se.lexicon.model.foodChoiseBuilder.FoodServiceChoice;
import se.lexicon.model.types.Beverage;

public class EconomyPrice extends Price {
    private Food economyClassFood;
    private FoodServiceChoice.ChoiceBuilder foodServiceChoice;
    private Beverage economyClassBeverage;

    public EconomyPrice(int seatPrice, int beveragePrice, int totalPrice, Food economyClassFood, FoodServiceChoice.ChoiceBuilder fsc, Beverage economyClassBeverage) {
        super(seatPrice, beveragePrice, totalPrice);
        this.economyClassFood = economyClassFood;
        this.foodServiceChoice = fsc;
        this.economyClassBeverage = economyClassBeverage;
    }




    public EconomyPrice(Food economyClassFood, FoodServiceChoice fsc) {
        super(5000,(fsc.getBreakfast().price() + fsc.getLunchAndDinner().price()),fsc.getBeverage().price());
        this.economyClassFood = economyClassFood;

    }

    @Override
    public double getSeatPrice() {
        return this.getSeatPrice();
    }

    @Override
    public double getBeveragePrice() {
        return this.getBeveragePrice();
    }

    @Override
    public double getTotalPrice() {
        return this.getTotalPrice();
    }
}
