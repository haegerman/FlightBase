package se.lexicon.model.priceConstruction;

import se.lexicon.model.foodChoiseBuilder.FoodServiceChoice;

public abstract class Food {
	
	PassengerClass passengerClass;
	FoodServiceChoice choise;
	
	public abstract double foodPrice();
}
