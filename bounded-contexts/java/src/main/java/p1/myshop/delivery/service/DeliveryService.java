package p1.myshop.delivery.service;

import p1.myshop.delivery.entity.Delivery;

public class DeliveryService {

    public double calculateOrderWeight(Delivery delivery) {
        return delivery.items().stream()
                .mapToDouble(orderLine -> orderLine.quantity.quantity() * orderLine.item.weight())
                .sum();
    }
}
