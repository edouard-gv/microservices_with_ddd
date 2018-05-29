package p1.myshop.adaptor.shoppingcart;

import p1.myshop.core.catalog.Product;
import p1.myshop.core.catalog.ProductId;
import p1.myshop.core.catalog.CatalogService;
import p1.myshop.core.delivery.*;
import p1.myshop.core.shoppingcart.Cart;

import java.util.stream.Collectors;

public class ProductionDeliveryAdapter implements DeliveryAdapter {

    @Override
    public double computeOrderWeight(Cart cart) {

        CatalogService catalogService = new CatalogService();
        DeliveryService deliveryService = new DeliveryService();

        Order order = buildOrderFromCart(cart, catalogService);

        return deliveryService.calculateOrderWeight(order);

    }

    private static Deliverable buildDeliverableFromProduct(Product product) {
        return new Deliverable(DeliverableId.from(product.productId().toString()), product.weight());
    }

    private static Order buildOrderFromCart(Cart cart, CatalogService catalogService) {
        return new Order(
                cart.items().stream()
                        .map(cartLine -> new OrderLine(
                                buildDeliverableFromProduct(catalogService.loadItem(ProductId.from(cartLine.itemId.toString()))),
                                new Quantity(cartLine.quantity.getValue())))
                        .collect(Collectors.toList())
        );
    }
}
