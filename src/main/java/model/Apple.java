package model;
import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {

    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equalsIgnoreCase(colour)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return 0;
    }
}
