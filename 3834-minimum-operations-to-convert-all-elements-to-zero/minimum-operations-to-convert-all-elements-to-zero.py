class Solution(object):
    def minOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        st = []
        ops = 0
        flag = 0
        for ele in nums:
            if ele == 0:
                flag = 1
            while st and st[-1] > ele  :
                st.pop()
            if not st or st[-1]!=ele :
                st.append(ele)
                ops+=1    
        return ops-flag