package tests;

import org.junit.Test;
import pages.*;


public class A101MobileTest extends  BaseTest {




    @Test
    public void A101MobileTest() throws InterruptedException {
        homePage.close_popup();
        homePage.go_to_dizalticorap();
        //productsPage.filter_the_black_products();
        productsPage.select_product_and_go_to_basket();
        basketPage.confirm_color_the_product();
        basketPage.click_to_accept_the_basket_button();
        loginPage.continue_without_a_member();
        loginPage.register_email();
        ordersCheckoutPage.accept_cookie();
        ordersCheckoutPage.create_address();
        ordersCheckoutPage.check_on_the_payment_screen();

    }



}