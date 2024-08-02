public class Basket {
    // остановился на 5.0 практика
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private String divider = "------";


    public Basket(){
        items = "Список товаров\n";
        this.limit = 100000;
    }
    public Basket(int limit){
        this();
        this.limit = limit;
    }
    public Basket(String items, int totalPrice){
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
    public void add(String name, int price){
        add(name, price, 1);
    }
    public void add(String name, int price, int count){
        boolean error = false;
        if (contrains(name)){
            error = true;
        }
        if (totalPrice + count * price >= limit){
            error = true;
        }
        if (error){
            System.out.println("Error occured =(");
            return;
        }

        items = items + "\n" + name +" - " + count+ " шт. - " + price;
        totalPrice = totalPrice + count * price;
    }
    public void add(String name, int price, int count, double weight){
        totalWeight = totalWeight + count * weight;
    }
    public void clear(){
        totalPrice = 0;
        items = "";
    }
    public int getTotalPrice(){
        return totalPrice;
    }
    public double getTotalWeight(){
        return totalWeight;
    }
    public boolean contrains(String name){
        return items.contains(name);
    }
    public void print(String title){
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println(divider + "\nОбщая стоимость товаров: " + getTotalPrice());
            System.out.println(divider + "\nОбщий вес товаров: " + getTotalWeight());
        }
    }
}
