package ru.stqa.addressbook;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteGrouptest extends TestBase {


  @Test
  public void testDeleteGroup() throws Exception {
    goToGroupPage();
    selectGroup();
    deleteGroup();
    returnToGroupPage();

  }

}
