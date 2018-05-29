package p1.myshop.adaptor;

import p1.myshop.adaptor.shoppingcart.ProductionDeliveryAdapter;
import p1.myshop.core.shoppingcart.Cart;
import p1.myshop.core.shoppingcart.ShoppingCartService;

import java.util.ArrayList;

public class Bootstrap {

    public static void main(String[] args) {

        //This is where you inject adaptors into your domain
        ShoppingCartService shoppingCartService = new ShoppingCartService(new ProductionDeliveryAdapter());

        //Create cart etc...
        Cart cart = new Cart(new ArrayList<>());

        //And if you need to estimate the weight of a cart, you just call
        System.out.println(shoppingCartService.estimateWeight(cart));
    }
}
