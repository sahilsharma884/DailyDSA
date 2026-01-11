package algo.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class big_sorting_test {

    @Test
    public void test1() {
        List<String> arr = Arrays.asList("31415926535897932384626433832795","1","3","10","3","5");
        List<String> expected = Arrays.asList("1","3","3","5","10","31415926535897932384626433832795");

        Assert.assertEquals(big_sorting.bigSorting(arr), expected);
    }

    @Test
    public void test2() {
        List<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("100");
        arr.add("12303479849857341718340192371");
        arr.add("3084193741082937");
        arr.add("3084193741082938");
        arr.add("111");
        arr.add("200");

        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("100");
        expected.add("111");
        expected.add("200");
        expected.add("3084193741082937");
        expected.add("3084193741082938");
        expected.add("12303479849857341718340192371");

        Assert.assertEquals(big_sorting.bigSorting(arr), expected);
    }
}
