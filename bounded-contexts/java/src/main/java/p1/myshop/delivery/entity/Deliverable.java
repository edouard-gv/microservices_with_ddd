package p1.myshop.delivery.entity;

public class Deliverable {
    DeliverableId deliverableId;
    double weight;

    public Deliverable(DeliverableId id, double weight) {
        this.deliverableId = id;
        this.weight = weight;
    }

    DeliverableId deliverableId() {
        return deliverableId;
    };

    public double weight() {
        return weight;
    }
}
