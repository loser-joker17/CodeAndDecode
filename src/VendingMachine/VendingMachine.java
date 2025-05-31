package VendingMachine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine {
    // request code , amount;

    Map<String , ItemShelf> selves = new HashMap<>();

    public void addItems(ItemShelf itemShelf){
        selves.put(itemShelf.getCode(),itemShelf);
    }

    public void displayItems() {
        System.out.println("\nAvailable Items:");
        for (ItemShelf shelf : selves.values()) {
            Items item = shelf.getItems();
            System.out.println(
                    " | Item: " + item.getName()
                    + " | Price: " + item.getPrice()
                    + " | Qty: " + shelf.getQuantity()
                    + (shelf.isSoldOut() ? " (Sold Out)" : ""));
        }
    }

    public void selectAndPay(String code , List<Coin>InsertedCoins){
        ItemShelf itemShelf = selves.get(code);

        int InsertedAmount=0;
        for(Coin coin : InsertedCoins){
            InsertedAmount += coin.getValue();
        }

        if(itemShelf==null){
            System.out.println("Invalid Item");
            return;
        }
        if(itemShelf.isSoldOut()){
            System.out.println("Item is Sold Out");
        }
        if(InsertedAmount==itemShelf.getItems().getPrice()) {
            itemShelf.dispense();
            System.out.println("Dispensed Item" + itemShelf.getItems().getName());
        }else {
            System.out.println("Please insert exact amount: " + itemShelf.getItems().getPrice()
                    + " | You inserted: " + InsertedAmount);
        }
    }
}
