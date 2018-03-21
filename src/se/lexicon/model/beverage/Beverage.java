package se.lexicon.model.beverage;

public interface Beverage {
    public se.lexicon.model.types.Beverage nonAlcholicBeverage(Beverage beverage);

    double price();
}
