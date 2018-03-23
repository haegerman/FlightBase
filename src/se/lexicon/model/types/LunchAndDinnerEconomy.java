package se.lexicon.model.types;

public enum LunchAndDinnerEconomy {
	UNO_pepperoni_deep_dish_pizza("12.99") {
		private double price = 12.99;
		@Override
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
        	this.price  = price;
        }
	},
	Smoked_Gouda_cheeseburger("15.88") {
		private double price = 15.88;
		@Override
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
        	this.price  = price;
        }
	};
	
	private double price = 15.88;//Smoked_Gouda_cheeseburger


	private LunchAndDinnerEconomy(final String price) {
		this.price = Double.valueOf(price);
	}


	public double getPrice() {
		return this.price;
	}


	public void setPrice(double price) {
    	this.price  = price;
    }
	public double price(){ return price;}
}
