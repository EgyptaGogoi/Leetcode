# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def maxDepth(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        def func(root, count):
            if root:
                count += 1
                if not root.left and not root.right:
                    return count
                return max(func(root.left, count), func(root.right, count))
            return 0
        return func(root, 0)
        