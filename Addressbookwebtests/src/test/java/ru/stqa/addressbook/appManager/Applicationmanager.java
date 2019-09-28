package ru.stqa.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Applicationmanager {
    WebDriver driver;

    private  NavigationHelper navigationHelper;
    private  GroupHelper groupHelper;
    private ContactHelper contactHelper;
    private SessionHelper sessionHelper;


    public void init() {
       groupHelper = new GroupHelper(driver);
       contactHelper = new ContactHelper(driver);
       navigationHelper = new NavigationHelper(driver);
       sessionHelper = new SessionHelper(driver);

        System.setProperty("webdriver.gecko.driver","/Users/Mari/Downloads/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/index.php");
        sessionHelper.login("admin", "secret");
    }


    public void stop() {
        driver.quit();
    }

    public boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    public boolean isAlertPresent() {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
