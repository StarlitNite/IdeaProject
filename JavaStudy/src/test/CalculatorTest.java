package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class CalculatorTest {



    private Calculator calculator;

    private double param1;
    private double param2;
    private double result;

    public CalculatorTest(double param1,double param2,double result){
        this.param1 = param1;
        this.param2 = param2;
        this.result = result;
    }
    @Parameterized.Parameters
    public static Collection data() {
        Object[][] params = new Object[][] {{3.0, 3.0, 6.0}, {4.0, 4.0, 8.0},{21.0, 33.0, 54.0}    };
        return Arrays.asList(params);
    }

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void add() {
        int result = calculator.add(1,2);
        Assert.assertEquals  (3,result);
    }

    @Test
    public void testAdd2() {
        Calculator cal = new Calculator();
        Assert.assertEquals(result, cal.add(param1, param2), 0.1);//�����������������ǣ�����������������ǰ������������һ�¿��ô˲���
    }
    @Test
    public void minus() {
        int result = calculator.minus(1,2);
        Assert.assertEquals(-1,result);
    }

    @Test
    public void multiply() {
        int result  = calculator.multiply(2,3);
        Assert.assertEquals(6,result);
    }

    @Test
    public void divide() {
        int result = 0;
        try{
            result = calculator.divide(6,4);
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail();
        }
        Assert.assertEquals(1,result);
    }

    @Test
    public void divide2() {
        Throwable tx = null;
        try{
            calculator.divide(4,0);
            Assert.fail();
        }
        catch(Exception ex){
            tx = ex;
        }
        Assert.assertNotNull(tx);
        Assert.assertEquals(Exception.class,tx.getClass());
        Assert.assertEquals("��������Ϊ�㣡",tx.getMessage());

    }

}

