class Solution(object):
    def maxDifference(self, s):
        """
        :type s: str
        :rtype: int
        """
        freq={}
        for char in s:
            freq[char]=freq.get(char,0)+1
        ls=list(freq.values())
        sortls=sorted(ls, reverse=True)
        i=0
        j=len(sortls)-1
        maxf= max(val for val in sortls if val%2==1)
        minf= min(val for val in sortls if val%2==0)
        return maxf-minf