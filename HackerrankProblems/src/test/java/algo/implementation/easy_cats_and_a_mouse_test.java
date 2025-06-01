package algo.implementation;

import org.junit.Assert;
import org.junit.Test;

public class easy_cats_and_a_mouse_test {

    @Test
    public void test1() {
        String actual = easy_cats_and_a_mouse.catAndMouse(1,2,3);
        Assert.assertEquals(actual, "Cat B");
    }

    @Test
    public void test2() {
        String actual = easy_cats_and_a_mouse.catAndMouse(1,3,2);
        Assert.assertEquals(actual, "Mouse C");
    }
}
