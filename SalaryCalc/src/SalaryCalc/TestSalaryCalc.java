package SalaryCalc;

import static org.junit.Assert.*;

public class TestSalaryCalc {
    
	func f = new func();
	@org.junit.Test
    public void firstTest() {
    	assertEquals(Double.toString(f.pribil(300, 6, 10)), "18000.0");
    }
	@org.junit.Test
	public void secondTest() {
    	assertEquals(Double.toString(f.prem(f.pribil(300, 6, 10))), "1800.0");
    }
	@org.junit.Test
	public void thirdTest() {
    	assertEquals(Double.toString(f.nalog(10, 300, 6, 10)), "1980.0");
    }
	@org.junit.Test
	public void fourthTest() {
    	assertEquals(Double.toString(f.result(10, 300, 6, 10)), "17820.0");
    }
}
