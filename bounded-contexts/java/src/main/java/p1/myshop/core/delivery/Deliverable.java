package p1.myshop.core.delivery;

public class Deliverable {
    private DeliverableId deliverableId;
    private double weight;

    public Deliverable(DeliverableId id, double weight) {
        this.deliverableId = id;
        this.weight = weight;
    }

    DeliverableId deliverableId() {
        return deliverableId;
    }

    public double weight() {
        return weight;
    }
}
