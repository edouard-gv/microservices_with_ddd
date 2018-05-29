package p1.myshop.core.delivery;

public class DeliveryService {

    public double calculateOrderWeight(Order order) {
        return order.items().stream()
                .mapToDouble(orderLine -> orderLine.quantity.quantity() * orderLine.deliverable.weight())
                .sum();
    }
}
