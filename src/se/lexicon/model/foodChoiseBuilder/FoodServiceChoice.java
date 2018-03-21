package se.lexicon.model.foodChoiseBuilder;

import se.lexicon.model.beverage.Beverage;
import se.lexicon.model.types.BreakfastBusiness;
import se.lexicon.model.types.LunchAndDinnerBusiness;

public class FoodServiceChoice {
	public static class ChoiceBuilder {
		private BreakfastBusiness breakfast;
		private LunchAndDinnerBusiness lunchAndDinner;
		private Beverage beverage;
		public ChoiceBuilder() {
		}
		
		public FoodServiceChoice build() {
			return new FoodServiceChoice(this);
		}

		public ChoiceBuilder bread(BreakfastBusiness breakfastBusiness) {
			this.breakfast = breakfastBusiness;
			return this;
		}
		
		public ChoiceBuilder condiments(LunchAndDinnerBusiness lunchAndDinnerBusiness) {
			this.lunchAndDinner = lunchAndDinnerBusiness;
			return this;
		}

	}
	
	private final BreakfastBusiness breakfast;
	private final LunchAndDinnerBusiness lunchAndDinner;
	private final Beverage beverage;

	private FoodServiceChoice(ChoiceBuilder choiceBuilder) {
		this.breakfast = choiceBuilder.breakfast;
		this.lunchAndDinner = choiceBuilder.lunchAndDinner;
		this.beverage = choiceBuilder.beverage;
	}

	public BreakfastBusiness getBreakfast() {
		return breakfast;
	}

	public LunchAndDinnerBusiness getLunchAndDinner() {
		return lunchAndDinner;
	}

	public Beverage getBeverage() { return beverage;}

}
