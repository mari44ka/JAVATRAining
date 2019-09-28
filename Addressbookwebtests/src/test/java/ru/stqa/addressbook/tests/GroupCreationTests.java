package ru.stqa.addressbook.tests;
import org.testng.annotations.*;
import ru.stqa.addressbook.model.GroupData;
import ru.stqa.addressbook.TestBase;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initiateGroupCreation();
    app.getGroupHelper().fillForm(new GroupData("testt3", "test1", "test2"));
    app.getGroupHelper().submitForm();
    app.getGroupHelper().returnToGroupPage();

  }


}

