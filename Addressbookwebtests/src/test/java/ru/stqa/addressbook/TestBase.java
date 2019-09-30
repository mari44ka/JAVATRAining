package ru.stqa.addressbook;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.addressbook.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();
=======

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.addressbook.appManager.Applicationmanager;


public class TestBase {

    protected final Applicationmanager app = new Applicationmanager();
>>>>>>> origin/master
=======

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.addressbook.appManager.Applicationmanager;


public class TestBase {

    protected final Applicationmanager app = new Applicationmanager();
>>>>>>> origin/master

=======

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.addressbook.appManager.Applicationmanager;


public class TestBase {

    protected final Applicationmanager app = new Applicationmanager();

>>>>>>> origin/master
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();


    }

}
