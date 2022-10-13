package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverListener;

import java.time.Duration;

public class ApplicationManager {


    WebDriver wd;
    HelperUser helperUser;
    HelperCar helperCar;



    public void init(){
   //     WebDriverListener listener = new ListenerWD();
        wd = new ChromeDriver();
     //   wd=new EventFiringDecorator<>(listener).decorate(wd);

    //    logger.info("All tests start in  ChromeDriver");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://ilcarro-1578153671498.web.app");
   //     logger.info("The current url is --->" +wd.getCurrentUrl());
        helperUser = new HelperUser(wd);
        helperCar= new HelperCar(wd);
    }

    public void stop(){
        wd.quit();
    }


    public HelperUser getHelperUser() {
        return helperUser;
    }

    public HelperCar helperCar() {
        return helperCar;
    }

}
