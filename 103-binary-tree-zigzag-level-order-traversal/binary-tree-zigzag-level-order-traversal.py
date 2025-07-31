# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def zigzagLevelOrder(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[List[int]]
        """
        if not root:
            return []

        q = deque([root])
        res = []
        rev = False
        while q:
            l_size = len(q)
            level = []

            for _ in range(l_size):
                x = q.popleft()
                level.append(x.val)
                if x.left:
                    q.append(x.left)
                if x.right:
                    q.append(x.right)
            if rev: 
                level.reverse()
                rev = False
            else:
                rev = True
            res.append(level)
        
        return res