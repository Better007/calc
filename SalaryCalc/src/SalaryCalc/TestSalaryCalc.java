package SalaryCalc;

import static org.junit.Assert.*;

public class TestSalaryCalc {
    
    
    /*@Test
    public void testCalcSalary(){
        try{
            //Установка начальных значений для теста
            SalaryCalc sc = new SalaryCalc();
            sc.arrTf[0].setText("100");
            sc.arrTf[1].setText("9");
            sc.arrTf[2].setText("24");
            sc.arrTf[3].setText("13");
            //вызов метода расчета зарплаты
            sc.calcSalary();
            //если расчетная ЗП совпадает с указанной, значит метод считает правильно и тест пройдет
            Assert.assertTrue("20671,20".equals(sc.arrTf[7].getText()));
        }catch(Exception e){
            //У случае возникновения ошибки, тест будет провален и в консоль будет выведено сообщение:
            Assert.fail("Проверьте правильность входных занчений");
        }
        
    }*/
	
	func f = new func();
	@org.junit.Test
    public void testF() {
    	assertEquals(Double.toString(f.pribil(300, 6, 10)), "18000.0");
    }
}
