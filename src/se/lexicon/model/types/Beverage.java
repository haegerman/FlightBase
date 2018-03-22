package se.lexicon.model.types;

public enum Beverage implements DrinkTypeInterface {
    ALCHOLIC("Whisky"), NON_ALCHOLIC_BEVERAGE("Coffee");
    private  String type;
    private  double price = 5;
    private Beverage(String type) {
        this.type = type;
    }
    @Override
    public String getType() {
        return type;
    }
    
    public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double price(){return  price;}
}
