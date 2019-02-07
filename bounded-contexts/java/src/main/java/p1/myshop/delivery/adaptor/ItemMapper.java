package p1.myshop.delivery.adaptor;

import p1.myshop.catalog.entity.Product;
import p1.myshop.catalog.entity.ProductId;
import p1.myshop.catalog.service.CatalogService;
import p1.myshop.delivery.entity.*;
import p1.myshop.shoppingcart.entity.Cart;

import java.util.stream.Collectors;

public class ItemMapper {

    private static Item buildDeliverableFromProduct(Product product) {
        return new Item(ItemId.from(product.productId().toString()), product.weight());
    }

    private static Quantity orderQuantityFromCartQuantity(p1.myshop.shoppingcart.entity.Quantity cartQuantity) {
        return null;
    }

    public static Delivery buildOrderFromCart(Cart cart, CatalogService catalogService) {
        return new Delivery(
                cart.items().stream()
                        .map(cartLine -> new DeliveryLine(
                                buildDeliverableFromProduct(catalogService.loadItem(ProductId.from(cartLine.itemId.toString()))),
                                orderQuantityFromCartQuantity(cartLine.quantity)))
                        .collect(Collectors.toList())
        );
    }
}
