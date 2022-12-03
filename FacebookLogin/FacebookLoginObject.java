package code.PRACTICE_JAVA.FacebookLogin;

import code.MyUtils.GenericUtils;

public class FacebookLoginObject {
    public static void main(String[] args) {
        FacebookLogin obj1 = new FacebookLogin();
        // ==> obj1.userName="Java"; it is private
        obj1.setUserName("HAN");
        obj1.setPassword("NY2023");
        System.out.println("obj1.getUserName() = " + obj1.getUserName());
        System.out.println("obj1.getPassword() = " + obj1.getPassword());

        FacebookChrome chrome= new FacebookChrome();
        chrome.openBrowser();
        chrome.goToUr1();
        chrome.passingCredentials("HAN123","NY2023");
        System.out.println("chrome.getUserName() = " + chrome.getUserName());
        System.out.println("chrome.getPassword() = " + chrome.getPassword());
        chrome.closeBrowser();
        GenericUtils.Stars();
    }
}
