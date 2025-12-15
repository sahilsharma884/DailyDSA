package algo.bit_manipulation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class lonely_integer_test {

    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(1);
        int actual = lonely_integer.lonelyinteger(list);
        int expect = 1;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(1, 1, 2);
        int actual = lonely_integer.lonelyinteger(list);
        int expect = 2;
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(0, 0, 1, 2, 1);
        int actual = lonely_integer.lonelyinteger(list);
        int expect = 2;
        Assert.assertEquals(expect, actual);
    }
}
