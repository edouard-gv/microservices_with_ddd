package p1.myshop.shopping;

import p1.myshop.shipping.ItemId;

public class CartItem {
    public final ItemId itemId;
    public final Quantity quantity;

    public CartItem(ItemId itemId, Quantity quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public ItemId itemId() {
        return itemId;
    }
}
