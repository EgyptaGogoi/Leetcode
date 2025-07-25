# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):            
    def longestZigZag(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        def countzz(root, ans , left):
            res = ans + 1
            if not root:
                return res-1
            if left:
                return max(countzz(root.left, 1, True), countzz(root.right, res, False))
            return max(countzz(root.left, res, True), countzz(root.right, 1, False))
        return countzz(root,0, True) - 1
        
        
        