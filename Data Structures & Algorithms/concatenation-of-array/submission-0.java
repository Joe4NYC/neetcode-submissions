class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int capacity = (nums.length) * 2;
        int[] newNums = new int[capacity];
        for (int i = 0; i < length; i++) {
            newNums[i] = nums[i];
            newNums[length+i] = nums[i];
        }
        return newNums;
    }
}