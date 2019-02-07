package p1.myshop.delivery.entity;

public class DeliveryLine {
    public final Item item;
    public final Quantity quantity;

    public DeliveryLine(Item item, Quantity quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item item() {
        return item;
    }
}
