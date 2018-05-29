package p1.myshop.shoppingcart.entity;

import java.util.List;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class Cart {
    private final List<CartLine> items;

    public Cart(List<CartLine> items) {
        this.items = items;
    }

    public List<CartLine> items() {
        return items;
    }
}
