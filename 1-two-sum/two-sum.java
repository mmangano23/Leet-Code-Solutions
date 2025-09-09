class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = 0;
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++){
            l = nums[i];
            for (int j = i + 1; j < nums.length; j++){
                r = nums[j];

                if (l + r == target){
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
    return answer;
    }
}