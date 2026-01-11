package algo.sorting;

import java.util.*;

public class big_sorting {

    public static List<String> bigSorting(List<String> unsorted) {
        List<String> sorted = new ArrayList<>();

        Map<Integer, List<String>> bucket = new HashMap<>();

        unsorted.forEach(v-> {
            if (!bucket.containsKey(v.length())) {
                bucket.put(v.length(), new ArrayList<>());
                bucket.get(v.length()).add(v);
            } else {
                bucket.get(v.length()).add(v);
            }
        });

        bucket.forEach((k,v) -> {
            if(v.size() > 1) {
                Collections.sort(v);
            }
        });

        Set<Integer> keys = new TreeSet<>(bucket.keySet());

        keys.forEach(k -> {
            sorted.addAll(bucket.get(k));
        });

        return sorted;
    }

    public static void main(String[] args) {
        List<String> unsorted = new ArrayList<>();
        unsorted.add("1");
        unsorted.add("2");
        unsorted.add("100");
        unsorted.add("12303479849857341718340192371");
        unsorted.add("3084193741082937");
        unsorted.add("3084193741082938");
        unsorted.add("111");
        unsorted.add("200");
        System.out.println(unsorted);
        List<String> sorted = bigSorting(unsorted);
        System.out.println(sorted);
    }

}
