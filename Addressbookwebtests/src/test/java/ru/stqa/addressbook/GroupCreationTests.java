package ru.stqa.addressbook;
import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    goToGroupPage();
    initiateGroupCreation();
    fillForm(new GroupData("testt3", "test1", "test2"));
    submitForm();
    returnToGroupPage();

  }


}

