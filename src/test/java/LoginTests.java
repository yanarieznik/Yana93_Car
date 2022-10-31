import manager.DataProvaiderUser;
import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void preCondition(){
        if(app.getHelperUser().isLogged()) {
            //if(app.getHelperUser().isElementPresent(By.xpath("//a"))){
            app.getHelperUser().logout();
            logger.info("The logout was needed ");
        }


    }
    @Test (dataProvider = "datalogin",dataProviderClass = DataProvaiderUser.class)
    public void loginSuccess(String email,String password){
        logger.info("Login scenario success was used data email: " +email+" & password: " +password);


        app.getHelperUser().openLoginFormHeader();
        app.getHelperUser().fillLoginForm(email,password);
        app.getHelperUser().submit();

        Assert.assertEquals(app.getHelperUser().getMessage(),"Logged in success");
        logger.info("In assert checked message 'Logged in success' in dialog  ");
    }


    @Test(dataProvider = "dataModelUser",dataProviderClass = DataProvaiderUser.class)
    public void loginSuccessModelsDP(User user){

        logger.info("Login scenario success was used data"+user.toString());
        app.getHelperUser().openLoginFormFooter();
        app.getHelperUser().fillLoginForm(user);
        app.getHelperUser().submit();

        Assert.assertEquals(app.getHelperUser().getMessage(),"Logged in success");
        logger.info("In assert checked message 'Logged in success' in dialog  ");
    }


    @Test
    public void loginSuccessModels(){


        User user=new User().withEmail("noa@gmail.com").withPassword("Nnoa12345$");
        logger.info("Login scenario success was used data"+user.toString());
        app.getHelperUser().openLoginFormFooter();
        app.getHelperUser().fillLoginForm(user);
        app.getHelperUser().submit();

        Assert.assertEquals(app.getHelperUser().getMessage(),"Logged in success");
        logger.info("In assert checked message 'Logged in success' in dialog  ");
    }

    @Test
    public void negativeWrongEmail(){

        User user=new User().withEmail("noagmail.com").withPassword("Nnoa12345$");
        logger.info("Login negative scenario with wrong email was used data"+user.toString());
        app.getHelperUser().openLoginFormHeader();
        app.getHelperUser().fillLoginForm(user);
        app.getHelperUser().submit();
        // Assert errorMessagge
        Assert.assertEquals(app.getHelperUser().getErrorText(),"It'snot look like email");
        // Assert buttonYalla not active
        Assert.assertTrue(app.getHelperUser().isYallaButtonNotActive());
        logger.info("In assert checked error message 'It'snot look like email' under name field ");
    }
    @Test
    public void negativeWrongPassword(){
        User user=new User().withEmail("noa@gmail.com").withPassword("Wwow12345$");
        logger.info("Login negative scenario with wrong passeord was used data"+user.toString());
        app.getHelperUser().openLoginFormHeader();
        app.getHelperUser().fillLoginForm(user);
        app.getHelperUser().submit();
        Assert.assertEquals(app.getHelperUser().getMessage(),"Wrong email or password");
        // Assert text message "Authorization error"
        Assert.assertEquals(app.getHelperUser().getTitleMessage(),"Authorization error");

        logger.info("In assert checked message 'Authorization error' & 'Wrong email or password' in dialog  ");
    }


    @AfterMethod
    public void postCondition(){

        app.getHelperUser().clickOkButton();

    }

}
