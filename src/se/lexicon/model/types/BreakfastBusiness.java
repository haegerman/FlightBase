package se.lexicon.model.types;

public enum BreakfastBusiness implements FoodTypeInterface{

    Sourdough_breakfast_sandwich("9.99") {
        @Override
        public double setPrice() {
            return 9.99;
        }
    },
    Chobani_Greek_yogurt_and_fresh_fruit("11.88") {
        @Override
        public double setPrice() {
            return 11.88;
        }
    },
    Southwestern_style_omelet("12.59") {
        @Override
        public double setPrice() {
            return 12.59;
        }
    },
    Fresh_start_breakfast("7.99") {
        @Override
        public double setPrice() {
            return 7.99;
        }
    };

    private final double price;



    private BreakfastBusiness(final String price) {
        this.price = Double.valueOf(price);
    }

    public double price(){ return price;}
}
