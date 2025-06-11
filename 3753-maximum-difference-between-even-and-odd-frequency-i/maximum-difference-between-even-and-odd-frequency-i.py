class Solution:
    def maxDifference(self, s: str) -> int:
        freq={}
        for char in s:
            freq[char]=freq.get(char,0)+1
        ls=list(freq.values())
        sortls=sorted(ls, reverse=True)
        i=0
        j=len(sortls)-1
        maxf=0
        minf=0
        while i<(len(sortls)):
            if sortls[i]%2==1:
                maxf=sortls[i]
                break
            i+=1
        
        while j>=0:
            if sortls[j]%2==0:
                minf=sortls[j]
                break
            j-=1
        # print(sortls)
        # print(maxf,minf)
        return maxf-minf
    