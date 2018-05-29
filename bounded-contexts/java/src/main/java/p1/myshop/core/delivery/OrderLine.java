package p1.myshop.core.delivery;

public class OrderLine {
    public final Deliverable deliverable;
    public final Quantity quantity;

    public OrderLine(Deliverable deliverable, Quantity quantity) {
        this.deliverable = deliverable;
        this.quantity = quantity;
    }

    public Deliverable item() {
        return deliverable;
    }
}
