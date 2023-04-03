
public class Main {
    public static void main(String[] args) {
        // Create ecommerce shop mediator
        Mediator mediator = new ConcreteMediator();

        // Create users with different payment strategies and discount percentages
        UserTemplate user1 = new CreditCardUser("John", 10);
        UserTemplate user2 = new PayPalUser("Jane", 5);
        UserTemplate user3 = new CryptocurrencyUser("Bob", 15);

        // Display available products for each user
        user1.displayAvailableProducts(mediator);
        //user2.displayAvailableProducts(mediator);
       // user3.displayAvailableProducts(mediator);

        user1.showUserDetails(user1);

        // User1 purchases toy car
        Product toyCar = new Product("Toy Car", 10.0);
        user1.purchaseProduct(toyCar, mediator);

        // User 2 purchases toy gun
        Product toyGun = new Product("Toy Gun", 20.0);
        user2.purchaseProduct(toyGun, mediator);

        // User 3 purchases toy car and toy gun
        user3.purchaseProduct(toyCar, mediator);
        user3.purchaseProduct(toyGun, mediator);
    }
}
