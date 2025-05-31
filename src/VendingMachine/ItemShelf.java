package VendingMachine;

public class ItemShelf {

    private final Items items;
    private final String code;
    private int quantity;

    public ItemShelf(Items items, String code , int quantity){
        this.items=items;
        this.code=code;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Items getItems() {
        return items;
    }

    public String getCode() {
        return code;
    }

    public boolean isSoldOut() {
        return quantity == 0;
    }

    public void dispense() {
        if (quantity > 0) {
            quantity--;
        }
    }
}
