# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    diam = 0
    def diameterOfBinaryTree(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        def getHeight(root):
            if root:
                left = getHeight(root.left)
                right = getHeight(root.right)
                self.diam = max(self.diam, left+right)
                return max(left,right)+1
            return 0
        getHeight(root)
        return self.diam
        