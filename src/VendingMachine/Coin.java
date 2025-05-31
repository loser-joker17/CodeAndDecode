package VendingMachine;

public enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private  int value;

    Coin(int value) {
        this.value=value;
    }
    public int getValue(){
        return value;
    }

    public static Coin fromValue(int val) {
        for (Coin c : Coin.values()) {
            if (c.getValue() == val) return c;
        }
        return null;
    }
}
