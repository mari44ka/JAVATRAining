package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.TestBase;
import ru.stqa.addressbook.model.GroupData;

public class GroupModificationTest extends TestBase {
    @Test
    public void TestGroupModification(){
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().selctEditButton();
        app.getGroupHelper().fillForm(new GroupData("NewGroup","test3"," "));
        app.getGroupHelper().updateForm();
        app.getNavigationHelper().goToGroupPage();

    }
}
