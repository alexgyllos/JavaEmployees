import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Bob", "XZ123456A", 1500.00, "CodeClan");
    }

    @Test
    public void hasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canSetName() {
        manager.setName("George");
        assertEquals("George", manager.getName());
    }

    @Test
    public void cannotSetNullName() {
        manager.setName(null);
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("XZ123456A", manager.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1500.00, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDepartment() {
        assertEquals("CodeClan", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10.00);
        assertEquals(1510.00, manager.getSalary(), 0.1);
    }

    @Test
    public void canPreventNegativeRaiseSalary() {
        manager.raiseSalary(-10.00);
        assertEquals(1500.00, manager.getSalary(), 0.1);
    }

    @Test
    public void hasPayBonus() {
        assertEquals(15.00, manager.payBonus(), 0.1);
    }
}
