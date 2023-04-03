public class CryptocurrencyUser extends UserTemplate {
    public CryptocurrencyUser(String name, double discountPercentage) {
        super(name, new CryptocurrencyPaymentStrategy(), discountPercentage);
    }

    @Override
    public void showUserDetails(UserTemplate userTemplate) {
        System.out.println("The user is: " +userTemplate.getName() + " and Payment Strategy is: " +userTemplate.getPaymentStrategy());
    }
}