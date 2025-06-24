class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        i = 0
        j = len(nums)-1
        while i < j:
            if nums[i] != val:
                i += 1
            elif nums[i] == val and nums[j] != val:
                temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                i += 1
                j -= 1
            else:
                j -= 1

        count = 0
        for ele in nums:
            if ele != val:
                count+=1
        return count
