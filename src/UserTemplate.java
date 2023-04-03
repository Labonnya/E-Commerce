public abstract class UserTemplate {
    private String name;
    private PaymentStrategy paymentStrategy;
    private double discountPercentage;

    public UserTemplate(String name, PaymentStrategy paymentStrategy, double discountPercentage) {
        this.name = name;
        this.paymentStrategy = paymentStrategy;
        this.discountPercentage = discountPercentage;
    }

    public void purchaseProduct(Product product, Mediator mediator) {
        mediator.purchase(product, this);
    }

    public void displayAvailableProducts(Mediator mediator) {
        mediator.displayProducts(this);
    }

    public abstract void showUserDetails(UserTemplate userTemplate);

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public String getName(){
        return name;
    }


}
