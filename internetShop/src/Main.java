public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Лопата", 280);
        petyaBasket.add("Бочка", 2900);

        Basket mashaBasket = new Basket("Стол", 5000);

        Basket vovaBasket = new Basket();
        vovaBasket.add("Клавиатура",1000);
        vovaBasket.add("Мышь", 2000, 2);
        vovaBasket.add("Монитор", 3000, 3, 5000);

        vasyaBasket.print("\nКорзина Васи: ");
        petyaBasket.print("\nКорзина Пети: ");
        mashaBasket.print("\nКорзина Маши: ");
        vovaBasket.print("\n Корзина Вовы: ");

    }
}