import manager.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {


    static ApplicationManager app = new ApplicationManager();

//    @BeforeMethod
//    public void loggerGetMethodName(Method m){
//        logger.info("Start Method with name --->" +m.getName());
//    }

    @BeforeSuite
    public void setUp() {
        app.init();
    }


    @AfterSuite
    public void tearDown() {

        //app.stop();
    }







}
