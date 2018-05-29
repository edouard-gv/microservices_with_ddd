package p1.myshop.catalog.entity;

public class Book implements Product {
    @Override
    public ProductId productId() {
        return null;
    }

    @Override
    public double weight() {
        return 0;
    }
}
