package VendingMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VendingMachine vendingMachine = new VendingMachine();

        Items coke = new Items("Coke", 100);

        ItemShelf addCoke = new  ItemShelf( coke, "A2",2);

        Items water = new Items("Water", 150);

        ItemShelf addWater = new  ItemShelf( water, "A1",3);

        Items chips = new Items("chips", 50);

        ItemShelf addChips = new  ItemShelf( chips, "A3",1);

        vendingMachine.addItems(addCoke);
        vendingMachine.addItems(addWater);
        vendingMachine.addItems(addChips);

        System.out.println("=== Welcome to the Vending Machine ===");
        vendingMachine.displayItems();

        System.out.print("Enter code of the item you want to buy (e.g., A1): ");
        String code = scanner.nextLine();

        System.out.println("Please Insert Coins, accepted coins: PENNY(1), NICKEL(5), DIME(10), QUARTER(25)");

        String coinInput = scanner.nextLine();
        String[] coinStrs = coinInput.split(",");

        List<Coin> coins = new ArrayList<>();
        for (String coinStr : coinStrs) {
            try {
                coins.add(Coin.valueOf(coinStr.trim().toUpperCase()));
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid coin entered: " + coinStr);
                return;
            }
        }

        vendingMachine.selectAndPay(code.toUpperCase(), coins);

        System.out.println("\n=== Final Inventory ===");
        vendingMachine.displayItems();

    }
}
