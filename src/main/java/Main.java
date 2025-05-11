import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, Colour.RED);
        Food greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] products = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(products);
        System.out.println("Сумма без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Сумма со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма вегетарианских продуктов: " + cart.getTotalVegetarianPrice());
    }
}
