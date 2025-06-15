class Solution(object):
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        queue=deque()
        count=0
        rows=len(grid)
        cols=len(grid[0])
        direction =[(1,0),(-1,0),(0,1),(0,-1)]
        for i in range(rows):
            for j in range(cols):
                if grid[i][j] == '1':
                    grid[i][j]='0'
                    queue.append([i,j])
                    while queue:
                        ni,nj=queue.popleft()
                        for dr,dc in direction:
                            ii=ni+dr
                            jj=nj+dc
                            if 0<=ii<rows and 0<=jj<cols and grid[ii][jj] == '1':
                                queue.append([ii,jj])
                                grid[ii][jj]='0'
                    count+=1
        print(grid)
        return count
        
                        


