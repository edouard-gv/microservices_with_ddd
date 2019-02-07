package p1.myshop.delivery.entity;

public class Item {
    ItemId itemId;
    double weight;

    public Item(ItemId id, double weight) {
        this.itemId = id;
        this.weight = weight;
    }

    ItemId deliverableId() {
        return itemId;
    };

    public double weight() {
        return weight;
    }
}
