# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isEvenOddTree(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: bool
        """
        if not root:
            return True
        q = deque([root])
        even = True
        level = []

        while q:
            l = len(q)
            level = []
            for i in range(l):
                x = q.popleft()
                level.append(x.val)
                if x.left:
                    q.append(x.left)
                if x.right:
                    q.append(x.right)
                if even:
                    if level[i] % 2 == 0:
                        return False
                    if i > 0 and level[i] <= level[i - 1]:
                        return False
                else:
                    if level[i] % 2 != 0:
                        return False
                    if i > 0 and level[i] >= level[i - 1]:
                        return False
            even = not even
        return True

        