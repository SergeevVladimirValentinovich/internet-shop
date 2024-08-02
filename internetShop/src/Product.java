public class Product {
    private String name;
    private int price;

    public Product(String name, int price){
        this.price = price;
        this.name = name;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String toString(){
        return name + " - " + price;
    }
}
