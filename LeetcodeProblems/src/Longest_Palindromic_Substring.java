public class Longest_Palindromic_Substring {

    private void printDp(int[][] dp) {
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[0].length;j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String longestPalindrome(String s) {
        int string_length = s.length();
        int[][] dp = new int[string_length][string_length];
        int maxValue = 0;
        String result = "";

        for(int diff=0;diff<string_length;diff++) {
            for(int i=0, j=diff+i; i<string_length && j<string_length; i++,j++) {
                if(i == j) dp[i][j] = 1;
                else if(diff == 1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j) ? 2 : 0;
                }
                else {
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] > 0) {
                        dp[i][j] = dp[i+1][j-1] + 2;
                    }
                }

                if(dp[i][j] > maxValue) {
                    maxValue = dp[i][j];
                    result = s.substring(i,i+maxValue);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Longest_Palindromic_Substring obj = new Longest_Palindromic_Substring();
//        System.out.println(obj.longestPalindrome("aacabdkacaa"));
//        System.out.println(obj.longestPalindrome("cbba"));
        System.out.println(obj.longestPalindrome("a"));
    }
}
