import org.junit.jupiter.api.Test;


public class A101Test extends BaseTest {


    @Test
    public void Web_test() {
        homePage.accept_cookies();
        homePage.go_to_dizalticorap();
        productsPage.select_product();
        productPage.correct_product_color_is_black();
        productPage.add_to_basket();
        productPage.navigate_to_basket();
        basketPage.confirm_basket();
        loginPage.contiune_without_a_member();
        loginPage.register_email();
        ordersCheckoutPage.create_new_address();
        ordersCheckoutPage.entering_address_information();
        ordersCheckoutPage.save_and_contiune();
        ordersCheckoutPage.check_on_the_payment_screen();
    }
}
