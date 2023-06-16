import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import EmployeeObjects.CommissionEmployee;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommisionEmployeeTest {
    CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

    @Test
    void testIncreaseSalesBy5(){
        emp.increaseSales(5);
        assertEquals(5,emp.getSales());
    }
    @Test
    void testIncreaseSalesNegative(){
        emp.increaseSales(-5);
        assertEquals(0,emp.getSales());
    }
    @Test
    void testIncreaseSalesDecimal(){
        emp.increaseSales(3.6);
        assertEquals(3.6,emp.getSales());
    }
    @Test
    void testHolidayBonus(){
        assertEquals(0,emp.holidayBonus());
    }
    @Test
    void testAnnualRaiseTwice(){
        emp.annualRaise();
        emp.annualRaise();
        assertEquals(.0305,emp.getRate());
    }
}
