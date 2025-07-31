import model.Food;
import model.Meat;
import model.Apple;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        Food meat = new Meat(5, 100); // 5 кг по 100 рублей
        Food redApples = new Apple(10, 50, "red"); // 10 кг красных яблок по 50 рублей
        Food greenApples = new Apple(8, 60, "green"); // 8 кг зеленых яблок по 60 рублей

        // Создание массива продуктов
        Food[] products = {meat, redApples, greenApples};

        // Инициализация корзины
        ShoppingCart cart = new ShoppingCart(products);

        // Вывод значений
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalWithoutDiscount() + " рублей");
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalWithDiscount() + " рублей");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianWithoutDiscount() + " рублей");
    }
}
