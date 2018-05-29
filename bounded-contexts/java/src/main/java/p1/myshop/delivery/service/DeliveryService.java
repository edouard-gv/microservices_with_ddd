package p1.myshop.delivery.service;

import p1.myshop.delivery.entity.Order;

public class DeliveryService {

    public double calculateOrderWeight(Order order) {
        return order.items().stream()
                .mapToDouble(orderLine -> orderLine.quantity.quantity() * orderLine.deliverable.weight())
                .sum();
    }
}
