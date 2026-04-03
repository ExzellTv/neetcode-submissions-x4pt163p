class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int elements : nums) {
            if (set.contains(elements)) {
                return true;
            }
            else {
                set.add(elements);
            }
        }

        return false;
    }
}