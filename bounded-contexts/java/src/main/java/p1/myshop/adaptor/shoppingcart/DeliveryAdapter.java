package p1.myshop.adaptor.shoppingcart;

import p1.myshop.shoppingcart.entity.Cart;

public interface DeliveryAdapter {
    double computeOrderWeight(Cart cart);
}
