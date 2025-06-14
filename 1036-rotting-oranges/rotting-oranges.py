class Solution(object):
    def orangesRotting(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        if not grid:
            return -1
        q = deque()
        fo = 0
        t =0
        for i in range(len(grid)):
            for j in range (len(grid[0])):
                if grid[i][j] == 1:
                    fo+=1
                if grid[i][j] == 2:
                    q.append([i,j,t])
        if fo == 0: return 0
        direction = [(-1,0),(1,0),(0,-1),(0,1)]
        while q:
            i,j,t=q.popleft()
            for minusi, minusj in direction:
                ii=i+minusi
                jj=j+minusj
                if 0<=ii<len(grid) and 0<=jj<len(grid[0]) and grid[ii][jj]== 1:
                    fo-=1
                    grid[ii][jj]=2
                    q.append([ii,jj,t+1]) 
     
        print(q)
        return t if fo == 0 else -1
         