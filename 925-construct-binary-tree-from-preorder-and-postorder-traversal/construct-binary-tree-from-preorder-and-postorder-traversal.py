# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    postmap = None
    def constructFromPrePost(self, preorder, postorder):
        """
        :type preorder: List[int]
        :type postorder: List[int]
        :rtype: Optional[TreeNode]
        """
        self.postmap = {key : i for i, key in enumerate(postorder)}
        def traverse(prest, prend, postr, posend):
            if prest> prend:
                return None
            node = TreeNode(preorder[prest])
            if prest == prend:
                return node
            leftind = self.postmap[preorder[prest+1]]
            l = leftind - postr + 1
            r = (posend - leftind) - 1
            node.left = traverse(prest+1, prest+l, postr, leftind) if l else None
            node.right = traverse(prest+l+1, prend, leftind+1, posend-1) if r else None
            return node
        return traverse(0, len(preorder)-1, 0, len(postorder)-1) 