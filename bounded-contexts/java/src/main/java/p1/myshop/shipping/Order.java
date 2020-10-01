package p1.myshop.shipping;

import java.util.List;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class Order {
    private final List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public List<Item> items() {
        return items;
    }
}
