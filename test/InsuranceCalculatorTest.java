import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceCalculatorTest {

    @Test
    public void extremeHighIncome() {
        double income = 1000000;
        assertEquals((income-60000)*0.02+105600, new InsuranceCalculator().calculateInsurance(income));
    }

    @Test
    public void highIncome() {
        double income = 60000;
        assertEquals((income-30000)*0.1+76500, new InsuranceCalculator().calculateInsurance(income));
    }

    @Test
    public void mediumIncome() {
        double income = 30000;
        assertEquals((income-10000)*0.2+35600 , new InsuranceCalculator().calculateInsurance(income));
    }

    @Test
    public void lowIncome() {
        double income = 10000;
        assertEquals(income*0.365 , new InsuranceCalculator().calculateInsurance(income));
    }

}