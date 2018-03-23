package se.lexicon.model.foodChoiseBuilder;


import se.lexicon.model.types.BreakfastBusiness;
import se.lexicon.model.types.BreakfastEconomy;
import se.lexicon.model.types.LunchAndDinnerBusiness;
import se.lexicon.model.types.LunchAndDinnerEconomy;
import se.lexicon.model.types.Beverage;

public class FoodServiceChoice {
	public static class ChoiceBuilder {
		private BreakfastBusiness breakfastB;
		private LunchAndDinnerBusiness lunchAndDinnerB;
		private BreakfastEconomy breakfastE;
		private LunchAndDinnerEconomy lunchAndDinnerE;
		private Beverage beverage;

		
		public ChoiceBuilder() {
		}
		
		public FoodServiceChoice build() {
			return new FoodServiceChoice(this);
		}

		public ChoiceBuilder breakfastB(BreakfastBusiness breakfastBusiness) {
			this.breakfastB = breakfastBusiness;
			return this;
		}
		
		public ChoiceBuilder lunchDinnerB(LunchAndDinnerBusiness lunchAndDinnerBusiness) {
			this.lunchAndDinnerB = lunchAndDinnerBusiness;
			return this;
		}
		
		public ChoiceBuilder breakfastE(BreakfastEconomy breakfastEconomy) {
			this.breakfastE = breakfastEconomy;
			return this;
		}
		
		public ChoiceBuilder lunchDinnerE(LunchAndDinnerEconomy lunchAndDinnerEconomy) {
			this.lunchAndDinnerE = lunchAndDinnerEconomy;
			return this;
		}
		
		public ChoiceBuilder beverage(Beverage beverage) {
			this.beverage = beverage;
			return this;
		}
	}
	
	private final BreakfastBusiness breakfastB;
	private final LunchAndDinnerBusiness lunchAndDinnerB;
	private final BreakfastEconomy breakfastE;
	private final LunchAndDinnerEconomy lunchAndDinnerE;
	private final Beverage beverage;

	private FoodServiceChoice(ChoiceBuilder choiceBuilder) {
		this.breakfastB = choiceBuilder.breakfastB;
		this.lunchAndDinnerB = choiceBuilder.lunchAndDinnerB;
		this.breakfastE = choiceBuilder.breakfastE;
		this.lunchAndDinnerE = choiceBuilder.lunchAndDinnerE;
		this.beverage = choiceBuilder.beverage;
	}

	public BreakfastBusiness getBusinessBreakfast() {
		return breakfastB;
	}
	
	public BreakfastEconomy getEconomyBreakfast() {
		return breakfastE;
	}

	public LunchAndDinnerBusiness getBusinessLunchAndDinner() {
		return lunchAndDinnerB;
	}
	public LunchAndDinnerEconomy getEconomyLunchAndDinner() {
		return lunchAndDinnerE;
	}
	public Beverage getBeverage() { return beverage;}

	public double price() {
		return (this.beverage.price() 
				+ this.breakfastB.getPrice() 
				+ this.breakfastE.getPrice() 
				+ this.lunchAndDinnerB.price() 
				+ this.lunchAndDinnerE.price());
	}

}
