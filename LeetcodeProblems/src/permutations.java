import java.util.ArrayList;
import java.util.List;

public class permutations {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] visited;

    public List<List<Integer>> permute(int[] nums) {
        visited = new boolean[nums.length];

        backtrack(nums, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, List<Integer> tempList) {
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                tempList.add(nums[i]);
                backtrack(nums, tempList);
                visited[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
        if(tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        }
    }

    public static void main(String[] args) {
        permutations p = new permutations();
        List<List<Integer>> output = p.permute(new int[]{1, 2, 3});
        for(List<Integer> list : output) {
            System.out.println(list);
        }
    }

}
