import EmployeeObjects.HourlyEmployee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class HourlyEmployeeTest {
    @Test
    void testIncreaseHoursby5(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(5);
        assertEquals(5,emp.getHoursWorked());
    }
    @Test
    void testIncreaseHoursNegative(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(-5);
        assertEquals(0,emp.getHoursWorked());
    }
    @Test
    void testIncreaseHoursDecimal(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(3.9);
        assertEquals(3.9,emp.getHoursWorked());
    }
    @Test
    void testAnnualRaise(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.annualRaise();
        assertEquals(34.49,emp.getWage());
    }
    @Test
    void testCalculateWeeklyPay35hrs(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(35);
        assertEquals(1149.75,emp.calculateWeeklyPay());
    }
    @Test
    void testCalculateWeeklyPay45hrs(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(45);
        assertEquals(1560.38,emp.calculateWeeklyPay());
    }
}
