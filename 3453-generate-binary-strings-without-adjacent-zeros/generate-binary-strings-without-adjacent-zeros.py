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
        extras=["0","1"]
        while queue:
            s=queue.popleft()
            if len(s) < n :
                for e in extras:
                    ss=s+e
                    if ss[len(ss)-1] == "0" and ss[len(ss)-2] == "0":
                        continue 
                    queue.append(ss)
            else :
                ls.append(s)
        return ls
            
            
    
