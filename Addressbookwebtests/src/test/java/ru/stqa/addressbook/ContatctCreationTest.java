package ru.stqa.addressbook;

import org.testng.annotations.Test;

public class ContatctCreationTest extends TestBase {

  @Test
  public void testContatctCreation() throws Exception {

    initiateContactCreation();
    fillContactform(new ContactData("Karl", "Hello", "5107863456", "cepter", "hello@gmail.com"));
    submitNewContactForm();
  }





  }

