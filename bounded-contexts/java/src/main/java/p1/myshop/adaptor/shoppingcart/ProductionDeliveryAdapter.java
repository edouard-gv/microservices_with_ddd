package p1.myshop.adaptor.shoppingcart;

import p1.myshop.catalog.entity.Product;
import p1.myshop.catalog.entity.ProductId;
import p1.myshop.catalog.service.CatalogService;
import p1.myshop.delivery.entity.Delivery;
import p1.myshop.delivery.entity.DeliveryLine;
import p1.myshop.delivery.entity.Quantity;
import p1.myshop.delivery.service.DeliveryService;
import p1.myshop.delivery.entity.Item;
import p1.myshop.delivery.entity.ItemId;
import p1.myshop.shoppingcart.entity.Cart;

import java.util.stream.Collectors;

public class ProductionDeliveryAdapter implements DeliveryAdapter {

    @Override
    public double computeOrderWeight(Cart cart) {

        CatalogService catalogService = new CatalogService();
        DeliveryService deliveryService = new DeliveryService();

        Delivery delivery = buildOrderFromCart(cart, catalogService);

        return deliveryService.calculateOrderWeight(delivery);

    }

    private static Delivery buildOrderFromCart(Cart cart, CatalogService catalogService) {
        return new Delivery(
                cart.items().stream()
                        .map(cartLine -> new DeliveryLine(
                                buildDeliverableFromProduct(catalogService.loadItem(ProductId.from(cartLine.itemId.toString()))),
                                new Quantity(cartLine.quantity.quantity())))
                        .collect(Collectors.toList())
        );
    }

    private static Item buildDeliverableFromProduct(Product product) {
        return new Item(ItemId.from(product.productId().toString()), product.weight());
    }
}
