package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.TestBase;
import ru.stqa.addressbook.model.ContactData;

import java.util.concurrent.TimeUnit;

public class ContactModificationTest extends TestBase {
    @Test
    public void testContactModification() throws Exception{
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactEdit();

        app.getContactHelper().fillContactform(new ContactData("Klara","","2341685","Google","new@g.com"));
        app.getContactHelper().updateContact();
        app.getNavigationHelper().goToHomePage();
    }

}
