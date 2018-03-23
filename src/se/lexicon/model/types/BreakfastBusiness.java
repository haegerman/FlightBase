package se.lexicon.model.types;

public enum BreakfastBusiness implements typeInterface{

    Sourdough_breakfast_sandwich("9.99") {
    	private double price = 9.99;
        @Override
        public double price() {
            return price;
        }
        
        public void setPrice(double price) {
        	this.price  = price;
        }
    },
    Chobani_Greek_yogurt_and_fresh_fruit("11.88") {
    	private double price = 11.88;
        @Override
        public double price() {
            return price;
        }
        
        public void setPrice(double price) {
        	this.price  = price;
        }
    },
    Southwestern_style_omelet("12.59") {
    	private double price = 12.59;
        @Override
        public double price() {
            return price;
        }
        
        public void setPrice(double price) {
        	this.price  = price;
        }
    },
    Fresh_start_breakfast("7.99") {
    	private double price = 7.99;
        @Override
        public double price() {
            return price;
        }
        
        public void setPrice(double price) {
        	this.price  = price;
        }
    };

    private double price = 12.59;//Default choice Southwestern_style_omelet 



    private BreakfastBusiness(final String price) {
        this.price = Double.valueOf(price);
    }

    public void setPrice(double price) {
    	this.price  = price;
    }
    //public double price(){ return price;}

	public double getPrice() {
		return price();
	}
	public double price(){ return this.price;}
}
