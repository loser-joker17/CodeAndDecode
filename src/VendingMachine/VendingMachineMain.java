package VendingMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachineMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VendingMachine vendingMachine = new VendingMachine();

        Items coke = new Items("Coke", 100);

        ItemShelf addCoke = new ItemShelf(coke, "A2", 2);

        Items water = new Items("Water", 150);

        ItemShelf addWater = new ItemShelf(water, "A1", 3);

        Items chips = new Items("chips", 50);

        ItemShelf addChips = new ItemShelf(chips, "A3", 1);

        vendingMachine.addItems(addCoke);
        vendingMachine.addItems(addWater);
        vendingMachine.addItems(addChips);

        System.out.println("=== Welcome to the Vending Machine ===");
        vendingMachine.displayItems();

        System.out.print("Enter the name of item you want to buy : ");
        String item = scanner.nextLine();

        Product product = Product.fromName(item);

        System.out.println("Please Insert Coins, accepted coins: 1 , 5 , 10 , 25 ");

        String coinInput = scanner.nextLine();
        String[] coinStrs = coinInput.split(",");

        List<Coin> coins = new ArrayList<>();
        for (String coinStr : coinStrs) {
            try {
                int coinValue = Integer.parseInt(coinStr.trim());
                Coin coin = Coin.fromValue(coinValue);
                if (coin != null) {
                    coins.add(coin);
                } else {
                    System.out.println("Invalid coin value entered: " + coinValue);
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + coinStr);
                return;
            }
        }
        String code = product.getCode();
        vendingMachine.selectAndPay(code.toUpperCase(), coins);

        System.out.println("\n=== Final Inventory ===");
        vendingMachine.displayItems();
    }
}
