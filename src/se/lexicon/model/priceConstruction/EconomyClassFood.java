package se.lexicon.model.priceConstruction;


public class EconomyClassFood  extends Food {


    @Override
    public double foodPrice() {
        return 0;
    }


    public void EconomyFoodSelectorSubMenu() {

        System.out.println("Please enter your choice" +
                "\n\t 0) Exit" +
                "\n\t 1) BreakfastEconomy " +
                "\n\t 2) Lunch and / or Dinner");
    }
}
