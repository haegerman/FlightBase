package se.lexicon.model.types;

public enum BreakfastEconomy {
	Sourdough_breakfast_sandwich("9.99") {
        private double price = 9.99;
		@Override
        public double getPrice() {
            return price;
        }
        public double setPrice(double price) {
        	return this.price  = price;
        }
    },
    Chobani_Greek_yogurt_and_fresh_fruit("11.88") {
    	private double price = 11.88;
        @Override
        public double getPrice() {
            return price;
        }
        public double setPrice(double price) {
        	return this.price  = price;
        }
    };
	
	
    private double price = 9.99;//Sourdough_breakfast_sandwich



    private BreakfastEconomy(final String price) {
        this.price = Double.valueOf(price);
    }


	public double getPrice() {
		return price();
	}


	public double setPrice(double price) {
		return this.price = price;
	}


	public double price(){ return this.price;}
}
