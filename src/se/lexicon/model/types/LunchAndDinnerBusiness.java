package se.lexicon.model.types;

public enum LunchAndDinnerBusiness implements typeInterface{

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
	},
	Chipotle_chicken_club_sandwich("14.59") {
		private double price = 14.59;
		@Override
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
        	this.price  = price;
        }
	},
	Mezze_sampler("12.59") {
		private double price = 12.59;
		@Override
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
        	this.price  = price;
        }
	},
	Thai_style_chicken_sandwich("17.99") {
		private double price = 17.99;
		@Override
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
        	this.price  = price;
        }
	},
	Cheeseburger("12.99") {
		private double price = 12.99;
		@Override
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
        	this.price  = price;
        }
	};

	private double price = 17.99; // Thai_style_chicken_sandwich


	private LunchAndDinnerBusiness(final String price) {
		this.price = Double.valueOf(price);
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price();
	}

	public double price(){ return price;}
}
