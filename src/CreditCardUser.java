public class CreditCardUser extends UserTemplate {
    public CreditCardUser(String name, double discountPercentage) {
        super(name, new CreditCardPaymentStrategy(), discountPercentage);
    }

    @Override
    public void showUserDetails(UserTemplate userTemplate) {
        System.out.println("The user is: " +userTemplate.getName() + " and Payment Strategy is: " +userTemplate.getPaymentStrategy());
    }
}