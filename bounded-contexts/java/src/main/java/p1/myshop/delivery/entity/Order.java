package p1.myshop.delivery.entity;

import java.util.List;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class Order {
    private final List<OrderLine> lines;

    public Order(List<OrderLine> lines) {
        this.lines = lines;
    }

    public List<OrderLine> items() {
        return lines;
    }
}
