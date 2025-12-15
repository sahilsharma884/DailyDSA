package algo.implementation;

import java.util.List;

public class lonely_integer {

    public static int lonelyinteger(List<Integer> a) {

        int result = 0;

        for(Integer element: a) {
            result = result ^ element;
        }

        return result;

    }
}
