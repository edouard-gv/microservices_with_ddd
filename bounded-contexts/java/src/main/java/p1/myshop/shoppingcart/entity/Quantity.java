package p1.myshop.shoppingcart.entity;

public class Quantity {
    private long value;

    public Quantity(long value) {
        this.value = value;
    }

    public long quantity() {
        return value;
    }
}
