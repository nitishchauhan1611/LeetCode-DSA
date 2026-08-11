class Solution {
    public int missingInteger(int[] nums) {
       // Calculate the sum of the longest sequential prefix starting at index 0
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Store all elements of nums in a HashSet for O(1) lookup
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

       // Find the smallest integer >= sum that is missing from nums
        while (numSet.contains(sum)) {
            sum++;
        }

        return sum;
    }
}