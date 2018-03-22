package se.lexicon.model.priceConstruction;

import se.lexicon.model.foodChoiseBuilder.FoodServiceChoice;
import se.lexicon.model.types.Beverage;

public class BusinessPrice extends Price {
    private  Food businessClassFood;
    private FoodServiceChoice.ChoiceBuilder foodServiceChoiceBuilder;
    private Beverage businessClassBeverage;


    public BusinessPrice(int seatPrice, int beveragePrice, int totalPrice, Food economyClassFood, FoodServiceChoice.ChoiceBuilder fsc, Beverage businessClassBeverage) {
        super(seatPrice, beveragePrice, totalPrice);
        this.businessClassFood = businessClassFood;
        this.foodServiceChoiceBuilder = fsc;
        this.businessClassBeverage = businessClassBeverage;
    }

    public  BusinessPrice(Food businessClassFood, FoodServiceChoice fsc){
        super(20000,(fsc.getBusinessBreakfast().price() + fsc.getBusinessLunchAndDinner().price()),fsc.getBeverage().price());
        this.businessClassFood = businessClassFood;
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
