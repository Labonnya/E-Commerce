import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    private List<Product> products = new ArrayList<>();

    public ConcreteMediator() {
        // Initialize product list
        products.add(new Product("Toy Car", 10.0));
        products.add(new Product("Toy gun", 20.0));
        products.add(new Product("Toy Duck", 30.0));
    }

    @Override
    public void purchase(Product product, UserTemplate user) {
        PaymentStrategy paymentStrategy = user.getPaymentStrategy();
        double discountPercentage = user.getDiscountPercentage();
        double discountedAmount = product.getPrice() * (100 - discountPercentage) / 100;
        paymentStrategy.processPayment(discountedAmount);
    }

    @Override
    public void displayProducts(UserTemplate user) {
        System.out.println("Available products:");
        for (Product product : products) {
            System.out.println(product.getProductName() + " - " + product.getPrice());
        }
    }
}
