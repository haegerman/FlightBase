package se.lexicon.model.priceConstruction;

import se.lexicon.model.types.typeInterface;

public enum PassengerClass implements typeInterface{
	BUSINESS("20_000"){
		private double price = 20_000;
		public double price() {
            return price;
        }
		public void setPrice(double price) {
        	this.price  = price;
        }
	}, ECONOMY("5000"){
		private double price = 5000;
		public double price() {
            return price;
        }
		public void setPrice(double price) {
        	this.price  = price;
        }
	};

	private double price = 20_000;
	
	public void setPrice(double price) {
    	this.price  = price;
    }
	
	public double price() {
		return price;
	}
	private PassengerClass(final String price) {
        //this.price = Double.valueOf(price);
    }
}
