class Solution(object):
    def findLucky(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        freq = {}
        maxluck = -1
        freq = Counter(arr)
        for key,value in freq.items():
            if key == value:
                maxluck = max(maxluck, key)
        return maxluck