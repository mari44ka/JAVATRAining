package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;
import ru.stqa.addressbook.TestBase;

public class ContatctCreationTest extends TestBase {

  @Test
  public void testContatctCreation() throws Exception {

    app.getContactHelper().initiateContactCreation();
    app.getContactHelper().fillContactform(new ContactData("Karl", "Hello", "5107863456", "cepter", "hello@gmail.com"));
    app.getContactHelper().submitNewContactForm();
  }





  }

