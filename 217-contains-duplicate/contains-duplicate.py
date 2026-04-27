class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        freq = {}
        for i in nums:
            if i not in freq:
                freq[i]=1
            else:
                freq[i]+=1
        for key, val in freq.items():
            if val > 1:
                return True
        return False