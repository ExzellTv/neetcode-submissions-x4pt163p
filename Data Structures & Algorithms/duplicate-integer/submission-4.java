class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<>();

        for (int elements : nums) {
            if (list.contains(elements)) {
                return true;
            }
            list.add(elements);
        }
        return false;
    }
}