package ru.stqa.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {



    public ContactHelper(WebDriver driver) {
        super(driver);

    }

    public void submitNewContactForm() {
      click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]"));
    }

    public void fillContactform(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstName());
        type(By.name("lastname"),contactData.getLastName());
        type(By.name("home"),contactData.getPhoneNumber());
        type(By.name("company"),contactData.getCompanyName());
        type(By.name("email"),contactData.getEmail());

    }

    public void initiateContactCreation() {
      click(By.linkText("add new"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteContact() {
        click(By.cssSelector("input[value ='Delete']"));
    }

    public void closingAlertWindow() {
        driver.switchTo().alert().accept();
    }


    public void initContactEdit() {
        click(By.cssSelector("img[alt='Edit']"));
    }

    public void updateContact() {
        click(By.name("update"));
    }

}
