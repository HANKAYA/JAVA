package code.PRACTICE_JAVA.FacebookLogin;

public class FacebookLogin {

    // Try this with chrome , firefox , opera ,safari , edge
    // Open browser -> Go to facebook login page url -> Passing credentials -> Close browser

    // [ variables : ] - [ username , password ] - Methods
    // Open browser () -> go to url -> pass credentials -> close browser

    private String userName;
    private String password;
    // E N C A P S U L A T I O N
    // 1- Hide the data from outside by using private keyword
    // 2- Step is to create setter/getter methods to read and modify them
    // Shortcut to create encapsulation getter and setter method -> [ right click - generate - getter setter ]
    public String getUserName(){
        return userName;
    }
    public void   setUserName(String userName){
        this.userName = userName;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    // M E T H O D S
    // ==> Open browser () -> go to url -> pass credentials -> close browser
    public void openBrowser(){
        System.out.println("Browser is started");
    }
    public void goToUr1(){
        System.out.println("On Facebook Login Page");
    }
    public void passingCredentials(String userName, String password){
        setUserName(userName);
        setPassword(password);
    }
    public void closeBrowser(){
        System.out.println("Browser is closed");
    }
}