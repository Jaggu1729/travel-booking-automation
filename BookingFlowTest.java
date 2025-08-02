package com.travel.qa.tests;

import com.travel.qa.base.BaseTest;
import com.travel.qa.pages.LoginPage;
import com.travel.qa.pages.LogoutPage;
import com.travel.qa.pages.SearchPage;
import org.testng.annotations.Test;

public class BookingFlowTest extends BaseTest {

    @Test
    public void completeBookingFlowTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser", "password123");

        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchTrip("Tirupati", "2025-08-15");

        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();
    }
}
