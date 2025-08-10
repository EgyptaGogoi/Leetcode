# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        def LCA(root):
            if not root:
                return None
            if root == p or root == q:
                    return root
            if root.right or root.left:  
                right = LCA(root.right)
                left = LCA(root.left)
                if right and left:
                    return root
                return left if left else right
        return LCA(root)
                