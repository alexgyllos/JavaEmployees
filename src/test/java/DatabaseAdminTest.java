import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;


import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Bob", "XZ123456A", 1500.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("XZ123456A", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1500.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(10.00);
        assertEquals(1510.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void hasPayBonus() {
        assertEquals(15.00, databaseAdmin.payBonus(), 0.1);
    }
}
