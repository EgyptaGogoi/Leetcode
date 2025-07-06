class Solution(object):
    def findLucky(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        freq = {}
        maxluck = -1
        for ele in arr:
            freq[ele] = freq.get(ele,0) + 1
        for key,value in freq.items():
            if key == value:
                maxluck = max(maxluck, key)

        return maxluck