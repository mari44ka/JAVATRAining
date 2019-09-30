package ru.stqa.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.addressbook.TestBase;

public class DeleteGrouptest extends TestBase {


  @Test
  public void testDeleteGroup() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteGroup();
    app.getGroupHelper().returnToGroupPage();

  }

}

