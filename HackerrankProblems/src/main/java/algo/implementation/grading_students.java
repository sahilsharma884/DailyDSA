package algo.implementation;

import java.util.ArrayList;
import java.util.List;

public class grading_students {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();

        for(Integer grade: grades) {
            if(grade < 38) result.add(grade);
            else {
                if(grade % 5 < 3) result.add(grade);
                else result.add(((grade/5) + 1) * 5);
            }
        }

        return result;
    }
}
