# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sumNumbers(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        def func(root, res):
            if root:
                sum = (res*10) + (root.val) 
                if not root.left and not root.right:
                    return sum
                else:
                    return func(root.left, sum) + func(root.right, sum)
            return 0
        return func(root, 0) 