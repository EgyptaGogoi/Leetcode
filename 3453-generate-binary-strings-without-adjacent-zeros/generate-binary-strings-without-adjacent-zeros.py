class Solution(object):
    def validStrings(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        queue= deque()
        ls=[]
        queue.append("0")
        queue.append("1")
        while queue:
            s=queue.popleft()
            if len(s) < n :
                if s[len(s)-1] == "1":
                   queue.append(s+"0")
                queue.append(s+"1")
            else :
                ls.append(s)
        return ls
            
            
    
