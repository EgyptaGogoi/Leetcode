class Solution(object):
    def validStrings(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        if n == 1:
            return ["0", "1"]
        if n == 2:
            return ["01", "10", "11"]
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
            
            
    
