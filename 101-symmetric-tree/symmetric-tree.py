# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isMirrorTree(self, t1, t2):
        if not t1 and not t2:
            return True
        if (not t1 and t2) or (not t2 and t1):
            return False
        if t1.val != t2.val:
            return False
        left = self.isMirrorTree(t1.left, t2.right)
        right = self.isMirrorTree(t1.right, t2.left)
        return left and right

    def isSymmetric(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: bool
        """
        if not root:
            return True
        return self.isMirrorTree(root.left, root.right)
         

        
        
        