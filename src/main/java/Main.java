import model.*;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, "red");
        Food greenApple = new Apple(8, 60, "green");

        Food[] items = { meat, redApple, greenApple };

        ShoppingCart cart = new ShoppingCart(items);

        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов: " + cart.getTotalVegetarianPrice());
    }
}