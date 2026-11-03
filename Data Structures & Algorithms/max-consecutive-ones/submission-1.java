class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int consecutiveNum = 0;
        int finalNum = 0;
        for (int n : nums) {
            if (n == 1) {
                consecutiveNum++;
                finalNum = Math.max(finalNum, consecutiveNum);
            }
            else {
                consecutiveNum = 0;
            }
        }
        return finalNum;
        
    }
}
