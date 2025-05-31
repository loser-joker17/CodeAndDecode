package VendingMachine;

public enum Product {
    WATER("Water", "A1"),
    COKE("Coke", "A2"),
    CHIPS("Chips", "A3");

    private final String name;
    private final String code;

    Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public static Product fromName(String input) {
        for (Product p : Product.values()) {
            if (p.getName().equalsIgnoreCase(input)) {
                return p;
            }
        }
        return null;
    }
}
