class Solution {
    public int[] twoSum(int[] nums, int target) {
        // nums[i] - target = something in map
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int total = target - nums[i];
            if (map.containsKey(total)) {
                int j = map.get(total);
                return new int[] {Math.min(i, j), Math.max(i, j)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
