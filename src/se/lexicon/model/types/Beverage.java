package se.lexicon.model.types;

public enum Beverage implements DrinkTypeInterface {
    ALCHOLIC("Whisky"), NON_ALCHOLIC_BEVERAGE("Coffee");
    private final String type;
    private final double price = 5;
    private Beverage(final String type) {
        this.type = type;
    }
    @Override
    public String getType() {
        return type;
    }
    public double price(){return  price;}
}
