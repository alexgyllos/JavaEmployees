import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Bob", "XZ123456A", 1500.00, "CodeClan", 10000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("XZ123456A", director.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1500.00, director.getSalary(), 0.1);
    }

    @Test
    public void hasDepartment() {
        assertEquals("CodeClan", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10.00);
        assertEquals(1510.00, director.getSalary(), 0.1);
    }

    @Test
    public void hasPayBonus() {
        assertEquals(30.00, director.payBonus(), 0.1);
    }

    @Test
    public void hasBudget() {
        assertEquals(10000.00, director.getBudget(), 0.1);
    }
}
