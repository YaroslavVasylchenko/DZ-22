package DataProvider;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name="age")
    public static Object [][] ageDataProvider(){
        return new Object[][]{{34},{19},{59},{60},{61},{65},{68},{71}};
    }

    @DataProvider(name="lastName")
    public static Object [][] lastNameDataProvider(){
        return new Object[][]{{"John"}, {"Brown"}, {null}, {""}};
    }

    @DataProvider(name="partnerDivorced")
    public static Object [][] partnerDivorcedDataProvider(){
        return new Object[][]{{"John", true}, {"Brown", false}, {null, true}, {"",false}};
    }
}