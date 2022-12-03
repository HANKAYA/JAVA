package code.PRACTICE_JAVA.FacebookLogin;

public class FacebookChrome extends FacebookLogin{

    // Belows are being inherited from FacebookLogin
    // username,password
    // getters / setters method
    // Open browser -> Go to url -> Close browser -> Pass credentials

    @Override
    public void openBrowser(){
        System.out.println("Chrome is started");
    }
}
