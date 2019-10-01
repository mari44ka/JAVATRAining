package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.TestBase;

public class ContactDeleteTest extends TestBase {
    @Test
    public void testContactDelete(){
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().closingAlertWindow();
        app.getNavigationHelper().goToHomePage();


    }
}
