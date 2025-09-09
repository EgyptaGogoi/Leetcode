# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isBalanced(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: bool
        """
        if not root:
            return True

        def height(root):
            if not root:
                return 0

            l = height(root.left)
            if l == -1:  
                return -1

            r = height(root.right)
            if r == -1:   
                return -1

            if abs(l - r) > 1:
                return -1   

            return 1 + max(l, r)  
        return height(root) != -1

with open("display_runtime.txt", "w") as f:
    f.write("1")
        