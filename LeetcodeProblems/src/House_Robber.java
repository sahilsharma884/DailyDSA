public class House_Robber {
    private void printDp(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int rob(int[] nums) {

        int sizeArr = nums.length;
        int[][] dp = new int[sizeArr][sizeArr];
        int maxVal = 0;

        for(int i=0;i<sizeArr;i++) {
            for(int j=i;j<sizeArr;j++) {
                if(i==j && dp[i][j] == 0) dp[i][j] = nums[j];
                else if(j-i == 1) dp[i][j] = 0;
                else {
                    if(i!=j) dp[i][j] = dp[i][i] + nums[j];
                    if(dp[j][j] < dp[i][j]) dp[j][j] = dp[i][j];
                }
            }
//            System.out.println("Processing for i: "+ i);
//            printDp(dp);
        }

        for(int i=0;i<sizeArr;i++) {
            for(int j=i;j<sizeArr;j++) {
                if(dp[i][j] > maxVal) maxVal = dp[i][j];
            }
        }


        return maxVal;
    }

    public static void main(String[] args) {
        House_Robber obj = new House_Robber();
        System.out.println(obj.rob(new int[]{1,2,3,1}));
        System.out.println(obj.rob(new int[]{2,7,9,3,1}));
        System.out.println(obj.rob(new int[]{1,4,7,5,3,8}));
    }
}
