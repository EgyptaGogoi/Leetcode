# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    pre = None
    inomap = None
    
    def buildTree(self, preorder, inorder):
        """
        :type preorder: List[int]
        :type inorder: List[int]
        :rtype: Optional[TreeNode]
        """
        self.pre = preorder
        self.inomap = {item:i for i, item in enumerate(inorder)}
        def traverse(pst, pend, ist, iend):
            inodx = self.inomap[self.pre[pst]]
            l = inodx - ist
            r = iend - inodx
            node = TreeNode(self.pre[pst])
            node.left = traverse(pst+1, pst+l, ist, inodx-1) if l else None
            node.right = traverse(pst+l+1, pend, inodx+1, iend) if r else None
            return node
        return traverse(0, len(preorder)-1, 0, len(inorder)-1)
        


            

