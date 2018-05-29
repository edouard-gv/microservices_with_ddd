package p1.myshop.adaptor.shoppingcart;

import p1.myshop.core.shoppingcart.Cart;

public interface DeliveryAdapter {
    double computeOrderWeight(Cart cart);
}
