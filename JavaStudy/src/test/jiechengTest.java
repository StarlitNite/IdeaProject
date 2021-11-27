package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
* jiecheng Tester.
*
* @author <Authors name>
* @since <pre>11ÔÂ 15, 2021</pre>
* @version 1.0
*/
@RunWith(Parameterized.class)
public class jiechengTest {

    private jiecheng jiecheng;
    private int num;
    private int result;

    public jiechengTest( int num, int result) {
        this.num = num;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection data() {
        Object[][] params = new Object[][]{{3,6},{4,24},{5,120}};
        return Arrays.asList(params);
    }

    @Before
    public void before() throws Exception {
        jiecheng = new jiecheng();
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: mult(int num)
    *
    */
    @Test
    public void testMult() throws Exception {
        int result = jiecheng.mult(3);
        Assert.assertEquals  (6,result);
        System.out.println("½×³ËÎª"+result);
    //TODO: Test goes here...
    }

    @Test
    public void testMult2() throws Exception {
        jiecheng jiecheng = new jiecheng();
        Assert.assertEquals  (result,jiecheng.mult(num));
        System.out.println("½×³ËÎª"+result);
    //TODO: Test goes here...
        }


}
