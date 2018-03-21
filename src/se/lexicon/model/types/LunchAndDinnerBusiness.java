package se.lexicon.model.types;

public enum LunchAndDinnerBusiness implements FoodTypeInterface{

	UNO_pepperoni_deep_dish_pizza("12.99") {
		@Override
		public double setPrice() {
			return 12.99;
		}
	},
	Smoked_Gouda_cheeseburger("15.88") {
		@Override
		public double setPrice() {
			return 15.88;
		}
	},
	Chipotle_chicken_club_sandwich("14.59") {
		@Override
		public double setPrice() {
			return 14.59;
		}
	},
	Mezze_sampler("12.59") {
		@Override
		public double setPrice() {
			return 12.59;
		}
	},
	Thai_style_chicken_sandwich("17.99") {
		@Override
		public double setPrice() {
			return 17.99;
		}
	},
	Cheeseburger("12.99") {
		@Override
		public double setPrice() {
			return 12.99;
		}
	};

	private final double price;


	private LunchAndDinnerBusiness(final String price) {
		this.price = Double.valueOf(price);
	}

	public double price(){ return price;}
}
