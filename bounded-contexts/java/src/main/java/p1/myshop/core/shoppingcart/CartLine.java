package p1.myshop.core.shoppingcart;

public class CartLine {
    public final ItemId itemId;
    public final Quantity quantity;

    public CartLine(ItemId itemId, Quantity quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public ItemId itemId() {
        return itemId;
    }
}
