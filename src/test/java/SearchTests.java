import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {


    @Test
    public void searchCurrentMonthSuccess() {
        app.helperSearch().searchCurrentMonth2("Tel Aviv", "10/25/2022", "10/30/2022");
        app.helperSearch().submit();
        Assert.assertTrue(app.helperSearch().isListOfCarsAppeared());
    }
    @Test (groups = {"smoke"})
    public void searchNextMonthSuccess(){
        app.helperSearch().searchNextMonth("Jerusalem Israel","11/25/2022","11/30/2022");
        // app.getSearch().searchNextMonth("Tel Aviv","11-25-22","11/30/2022");
        app.helperSearch().submit();
        Assert.assertTrue(app.helperSearch().isListOfCarsAppeared());
    }



    @Test
    public void searchAnyPeriod() {
        app.helperSearch().selectAnyPeriod("Tel Aviv", "12/20/2022", "1/10/2023");

    }
//@Test
//    public void searchInPast(){
//        app.helperSearch().typePeriodInPast("Tel Aviv","10/5/2022","10/10/2022");
//        app.helperSearch().submit();
//        Assert.assertTrue(app.getHelperUser().isYallaButtonNotActive());
//        Assert.assertTrue(app.getHelperUser().isErrorMessageDisplayed());  ///You can't pick date before today
//

    }







