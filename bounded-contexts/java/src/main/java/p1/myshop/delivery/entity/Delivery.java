package p1.myshop.delivery.entity;

import java.util.List;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class Delivery {
    private final List<DeliveryLine> lines;

    public Delivery(List<DeliveryLine> lines) {
        this.lines = lines;
    }

    public List<DeliveryLine> items() {
        return lines;
    }
}
