class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        myset = set(nums)
        dupe = (len(nums) != len(myset))

        return dupe