package se.lexicon.model.priceConstruction;

import se.lexicon.model.types.Beverage;
import se.lexicon.model.types.BreakfastBusiness;
import se.lexicon.model.types.LunchAndDinnerBusiness;

public class BusinessClassFood extends Food {

	private BreakfastBusiness breakfast;
	private LunchAndDinnerBusiness lunchAndDinner;
	private Beverage beverage;

	public BusinessClassFood(BreakfastBusiness breakfast, LunchAndDinnerBusiness lunchAndDinner, Beverage beverage) {
		this.breakfast = breakfast;
		this.lunchAndDinner = lunchAndDinner;
		this.beverage = beverage;
	}

	public BreakfastBusiness getBreakfast() {
		return breakfast;
	}

	public LunchAndDinnerBusiness getLunchAndDinner() {
		return lunchAndDinner;
	}

	public Beverage getBeverage() {
		return beverage;
	}

	@Override
	public double foodPrice() {

		return this.beverage.price() +
				this.breakfast.price() +
				this.lunchAndDinner.price();
	}

}
