class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if (map.containsKey(sum)) {
                int j = map.get(sum);
                return new int[] {Math.min(i, j), Math.max(i, j)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
