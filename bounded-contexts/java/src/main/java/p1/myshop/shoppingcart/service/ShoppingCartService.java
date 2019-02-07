package p1.myshop.shoppingcart.service;

import p1.myshop.adaptor.shoppingcart.DeliveryAdapter;
import p1.myshop.shoppingcart.entity.Cart;

public class ShoppingCartService {

    private DeliveryAdapter deliveryAdapter;

    public ShoppingCartService(DeliveryAdapter deliveryAdapter) {
        this.deliveryAdapter = deliveryAdapter;
    }

    public double estimateWeight(Cart cart) {
        return deliveryAdapter.computeOrderWeight(cart);
    }

}
