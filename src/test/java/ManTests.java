
import DataProvider.TestDataProvider;
import com.persone.information.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTests {
    private Man man;

    @Test(description = "Check if a man is not retired", dataProvider = "age", dataProviderClass = TestDataProvider.class)
    public void testIsNotRetired(int age){
        man = new Man("Bob", "Last", age, "Name", false);
        Assert.assertFalse(man.isRetired(), "Age "+man.getAge()+" is 65+ years");
    }

    @Test(description = "Check if a man is retired", dataProvider = "age", dataProviderClass = TestDataProvider.class)
    public void testIsRetired(int age){
        man = new Man("John", "LastName", age, "LastName", false);
        Assert.assertTrue(man.isRetired(), "Age "+man.getAge()+" is below 65 years");
    }

    @Test(description = "Check if a partner is changed and isDivorced is changed when had one before", dataProvider = "partnerDivorced", dataProviderClass = TestDataProvider.class)
    public void testDeregisterPartnershipChanges(String partner, Boolean divorced){
        man = new Man("John", "Joil", 60, partner, divorced);
        man.deregisterPartnership();
        Assert.assertNotEquals(man.getLastName(), man.getPartner());
        Assert.assertTrue(man.isDivorced(), "The field 'isDivorced' set to false");
    }

    @Test(description = "Check if a partner is not changed when didn't have one before", dataProvider = "partnerDivorced", dataProviderClass = TestDataProvider.class)
    public void testDeregisterPartnershipNotChanges(String partner, Boolean divorced) {
        man = new Man("John", "Kolin", 60, partner, divorced);
        man.deregisterPartnership();
        Assert.assertEquals(man.getPartner(), partner);
    }
}