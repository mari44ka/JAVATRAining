package ru.stqa.addressbook;

<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of 94b780f... Merge remote-tracking branch 'origin/master'
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
      System.setProperty("webdriver.gecko.driver","/Users/Mari/Downloads/geckodriver");
      driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("http://localhost/addressbook/index.php");
      login("admin", "secret");
    }

    private void login(String username, String password) {
      driver.findElement(By.name("user")).click();
      driver.findElement(By.name("user")).clear();
      driver.findElement(By.name("user")).sendKeys(username);
      driver.findElement(By.name("pass")).click();
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys(password);
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
      //driver.findElement(By.xpath("//body")).click();
    }

    protected void returnToGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }

    protected void submitForm() {
      driver.findElement(By.name("submit")).click();
    }

    protected void fillForm(GroupData groupData) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).clear();
      driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).clear();
      driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

<<<<<<< HEAD
    protected void initiateGroupCreation() {
      driver.findElement(By.name("new")).click();
    }

    protected void goToGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }

    protected void submitNewContactForm() {
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]")).click();
    }

    protected void fillContactform(ContactData contactData) {
      driver.findElement(By.name("firstname")).clear();
      driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());
      driver.findElement(By.name("lastname")).click();
      driver.findElement(By.name("lastname")).clear();
      driver.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
      driver.findElement(By.name("home")).click();
      driver.findElement(By.name("home")).clear();
      driver.findElement(By.name("home")).sendKeys(contactData.getPhoneNumber());
      driver.findElement(By.name("company")).click();
      driver.findElement(By.name("company")).clear();
      driver.findElement(By.name("company")).sendKeys(contactData.getCompanyName());
      driver.findElement(By.name("email")).click();
      driver.findElement(By.name("email")).clear();
      driver.findElement(By.name("email")).sendKeys(contactData.getEmail());
    }

    protected void initiateContactCreation() {
      driver.findElement(By.linkText("add new")).click();
    }

    protected void deleteGroup() {
      driver.findElement(By.name("delete")).click();
    }

    protected void selectGroup() {
      driver.findElement(By.name("selected[]")).click();
=======
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
>>>>>>> parent of 94b780f... Merge remote-tracking branch 'origin/master'
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
      driver.quit();


    }

    private boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }
}
