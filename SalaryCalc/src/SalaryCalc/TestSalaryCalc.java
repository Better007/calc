package SalaryCalc;

import static org.junit.Assert.*;

public class TestSalaryCalc {
    
    
    /*@Test
    public void testCalcSalary(){
        try{
            //��������� ��������� �������� ��� �����
            SalaryCalc sc = new SalaryCalc();
            sc.arrTf[0].setText("100");
            sc.arrTf[1].setText("9");
            sc.arrTf[2].setText("24");
            sc.arrTf[3].setText("13");
            //����� ������ ������� ��������
            sc.calcSalary();
            //���� ��������� �� ��������� � ���������, ������ ����� ������� ��������� � ���� �������
            Assert.assertTrue("20671,20".equals(sc.arrTf[7].getText()));
        }catch(Exception e){
            //� ������ ������������� ������, ���� ����� �������� � � ������� ����� �������� ���������:
            Assert.fail("��������� ������������ ������� ��������");
        }
        
    }*/
	
	func f = new func();
	@org.junit.Test
    public void testF() {
    	assertEquals(Double.toString(f.pribil(300, 6, 10)), "18000.0");
    }
}
