package ru.stqa.addressbook;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.addressbook.appManager.Applicationmanager;


public class TestBase {

    protected final Applicationmanager app = new Applicationmanager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();


    }

}
