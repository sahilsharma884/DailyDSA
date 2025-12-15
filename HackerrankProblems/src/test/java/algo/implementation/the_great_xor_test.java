package algo.implementation;

import org.junit.Assert;
import org.junit.Test;

public class the_great_xor_test {

    @Test
    public void test1() {
        long x = 2;
        long actual = the_great_xor.theGreatXor(x);
        long expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        long x = 10;
        long actual = the_great_xor.theGreatXor(x);
        long expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        long x = 100;
        long actual = the_great_xor.theGreatXor(x);
        long expected = 27;
        Assert.assertEquals(expected, actual);
    }

}
