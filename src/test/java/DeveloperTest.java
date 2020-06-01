import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;


import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Bob", "XZ123456A", 1500.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("XZ123456A", developer.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1500.00, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(10.00);
        assertEquals(1510.00, developer.getSalary(), 0.1);
    }

    @Test
    public void hasPayBonus() {
        assertEquals(15.00, developer.payBonus(), 0.1);
    }
}
