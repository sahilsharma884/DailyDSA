package algo.implementation;

import org.junit.Assert;
import org.junit.Test;

public class easy_jumping_on_the_clouds_test {

    @Test
    public void test() {
        int[] c = {0, 0, 1, 0, 0, 1, 1, 0};
        int k =2;
        int actual = easy_jumping_on_the_clouds.jumpingOnClouds(c,k);
        Assert.assertEquals(92, actual);
    }

    @Test
    public void test2() {
        int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        int k =3;
        int actual = easy_jumping_on_the_clouds.jumpingOnClouds(c,k);
        Assert.assertEquals(80, actual);
    }
}
