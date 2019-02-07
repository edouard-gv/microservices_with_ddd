package p1.myshop.adaptor.shoppingcart;

import p1.myshop.catalog.entity.Product;
import p1.myshop.catalog.entity.ProductId;
import p1.myshop.catalog.service.CatalogService;
import p1.myshop.delivery.entity.Order;
import p1.myshop.delivery.entity.OrderLine;
import p1.myshop.delivery.entity.Quantity;
import p1.myshop.delivery.service.DeliveryService;
import p1.myshop.delivery.entity.Deliverable;
import p1.myshop.delivery.entity.DeliverableId;
import p1.myshop.shoppingcart.entity.Cart;

import java.util.stream.Collectors;

public class ProductionDeliveryAdapter implements DeliveryAdapter {

    @Override
    public double computeOrderWeight(Cart cart) {

        CatalogService catalogService = new CatalogService();
        DeliveryService deliveryService = new DeliveryService();

        Order order = buildOrderFromCart(cart, catalogService);

        return deliveryService.calculateOrderWeight(order);

    }

    private static Order buildOrderFromCart(Cart cart, CatalogService catalogService) {
        return new Order(
                cart.items().stream()
                        .map(cartLine -> new OrderLine(
                                buildDeliverableFromProduct(catalogService.loadItem(ProductId.from(cartLine.itemId.toString()))),
                                new Quantity(cartLine.quantity.quantity())))
                        .collect(Collectors.toList())
        );
    }

    private static Deliverable buildDeliverableFromProduct(Product product) {
        return new Deliverable(DeliverableId.from(product.productId().toString()), product.weight());
    }
}
