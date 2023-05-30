import com.persone.information.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;
import DataProvider.TestDataProvider;

public class WomanTests {
    private Woman woman;

    @Test(description = "Check if a woman is not retired", dataProvider = "age", dataProviderClass = TestDataProvider.class)
    public void testIsNotRetired(int age) {
        woman = new Woman("Anna", "Gok", age, "Kolya", false, "LastNameOriginal");
        Assert.assertFalse(woman.isRetired(), "Age " + woman.getAge() + " is 60+ years");
    }

    @Test(description = "Check if a woman is retired", dataProvider = "age", dataProviderClass = TestDataProvider.class)
    public void testIsRetired(int age) {
        woman = new Woman("Bella", "LastName", age, "LastName", false, "LastNameOriginal");
        Assert.assertTrue(woman.isRetired(), "Age " + woman.getAge() + " is below 60 years");
    }

    @Test(description = "Check if a partner is changed, isDivorced is changed and LastName is changed", dataProvider = "partnerDivorced", dataProviderClass = TestDataProvider.class)
    public void testDeregisterPartnershipChanges(String partner, Boolean divorced) {
        woman = new Woman("Bella", "LastName", 60, partner, divorced, "LastNameOriginal");
        woman.deregisterPartnership();
        Assert.assertNotEquals(woman.getPartner(), woman.getLastName());
        Assert.assertTrue(woman.isDivorced());
        Assert.assertEquals(woman.getLastName(),woman.getLastNameOriginal(), "Partner is set to null");
    }

    @Test(description = "Check if a partner is not changed", dataProvider = "partnerDivorced", dataProviderClass = TestDataProvider.class)
    public void testDeregisterPartnershipNotChanges(String partner, Boolean divorced) {
        woman = new Woman("Anna", "LastNameOriginal", 60, partner, divorced, "LastNameOriginal");
        woman.deregisterPartnership();
        Assert.assertEquals(woman.getPartner(), partner);
    }

    @Test(description = "Check if getLastNameOriginal() works", dataProvider = "lastName", dataProviderClass = TestDataProvider.class)
    public void testLastNameOriginal(String lastName) {
        woman = new Woman("Lisa", "Yong", 60, null, false, "Yong");
        woman.setLastNameOriginal(lastName);
        Assert.assertEquals(woman.getLastNameOriginal(), lastName, "The original name is not the same");
    }

    @Test(description = "Check if a woman has LastNameOriginal not NULL", dataProvider = "lastName", dataProviderClass = TestDataProvider.class)
    public void testGetLastNameOriginalNotNull(String lastName) {
        woman = new Woman("Lisa", "Yong", 60, null, false, "lastName");
        Assert.assertNotEquals(woman.getLastNameOriginal(), null, "LastNameOriginal is null");
    }

    @Test(description = "Check if a woman has setLastNameOriginal()", dataProvider = "lastName", dataProviderClass = TestDataProvider.class)
    public void testSetLastNameOriginal(String lastName) {
        woman = new Woman("Lisa", "Grol", 60, null, false, "Grol");
        woman.setLastNameOriginal(lastName);
        Assert.assertEquals(woman.getLastNameOriginal(), lastName);
    }
}