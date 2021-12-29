package oop_class_Chirag.abstraction;

abstract class Page {
    public abstract void openPage();
    public abstract void waitForPageToLoad();
    public void scrollDown() {
        //page scroll code
    }
}

class LoginPage extends Page {

    @Override
    public void openPage() {
        //Code to open login page
    }

    @Override
    public void waitForPageToLoad() {
        //Code to check login page loaded successfully
    }

}

class HomePage extends Page {

    @Override
    public void openPage() {
        //Code to open home login page
    }

    @Override
    public void waitForPageToLoad() {
        //Code to check home page loaded successfully
    }

}

public class AbstractClassPageExample {
    public static void main(String[] args) {

    }
}
