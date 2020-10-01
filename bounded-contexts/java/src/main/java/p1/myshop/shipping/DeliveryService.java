package p1.myshop.shipping;

public class DeliveryService {

    public double calculateOrderWeight(Order order) {
        return order.items().stream()
                .map(Item::itemId)
                .map(this::loadItem)
                .mapToDouble(HasWeight::weight)
                .sum();
    }

    public Item loadItem(ItemId itemId) {
        return null;
    }
}
