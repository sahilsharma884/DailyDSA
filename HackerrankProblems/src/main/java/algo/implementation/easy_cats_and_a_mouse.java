package algo.implementation;

public class easy_cats_and_a_mouse {

    public static String catAndMouse(int x, int y, int z) {

        int diffA = (z-x) > 0 ? (z-x) : (x-z);
        int diffB = (z-y) > 0 ? (z-y) : (y-z);

        if(diffA > diffB) return "Cat B";
        if(diffA < diffB) return "Cat A";

        return "Mouse C";
    }
}
