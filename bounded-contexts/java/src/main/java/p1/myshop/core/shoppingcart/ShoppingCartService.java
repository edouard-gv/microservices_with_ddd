package p1.myshop.core.shoppingcart;

import p1.myshop.adaptor.shoppingcart.DeliveryAdapter;

public class ShoppingCartService {

    private DeliveryAdapter deliveryAdapter;

    public ShoppingCartService(DeliveryAdapter deliveryAdapter) {
        this.deliveryAdapter = deliveryAdapter;
    }

    public double estimateWeight(Cart cart) {
        return deliveryAdapter.computeOrderWeight(cart);
    }
}
