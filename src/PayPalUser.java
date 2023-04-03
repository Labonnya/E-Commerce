public class PayPalUser extends UserTemplate {
    public PayPalUser(String name, double discountPercentage) {
        super(name, new PayPalPaymentStrategy(), discountPercentage);
    }
    @Override
    public void showUserDetails(UserTemplate userTemplate) {
        System.out.println("The user is: " +userTemplate.getName() + " and Payment Strategy is: " +userTemplate.getPaymentStrategy());
    }
}