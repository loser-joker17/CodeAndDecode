package VendingMachine;

public class Items {

    private final String name;
    private final int price;

    public Items(String name , int price){
        this.name=name;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
