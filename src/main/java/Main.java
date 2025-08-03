import model.Food;
import model.Meat;
import model.Apple;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        Food meat = new Meat(5, 100); // 5 кг по 100 рублей
        Food redApples = new Apple(10, 50, Colour.RED); // 10 кг красных яблок по 50 рублей
        Food greenApples = new Apple(8, 60, Colour.GREEN); // 8 кг зеленых яблок по 60 рублей

        // Создание массива продуктов
        Food[] products = {meat, redApples, greenApples};

        // Инициализация корзины
        ShoppingCart cart = new ShoppingCart(products);

        // Вывод значений
        System.out.printf("Общая сумма товаров без скидки: %.2f рублей%n", cart.getTotalWithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %.2f рублей%n", cart.getTotalWithDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %.2f рублей%n", cart.getTotalVegetarianWithoutDiscount());
    }
}
