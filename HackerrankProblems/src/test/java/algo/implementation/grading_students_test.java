package algo.implementation;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class grading_students_test {

    @Test
    public void test1() {
        List<Integer> arr = Arrays.asList(73,67,38,33);

        List<Integer> actual = grading_students.gradingStudents(arr);
        List<Integer> expected = new ArrayList<>();
        expected.add(75);
        expected.add(67);
        expected.add(40);
        expected.add(33);

        Assert.assertEquals(Arrays.asList(expected), Arrays.asList(actual));

    }

}
