# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: Optional[TreeNode]
        :type q: Optional[TreeNode]
        :rtype: bool
        """
        pp = deque([p])
        qq = deque([q])
        while pp and qq:
            x = pp.pop()
            y = qq.pop()
            if (not x and y) or (not y and x):
                return False
            if x and y:
                if x.val != y.val:
                    return False
                pval = x.left if x.left else None
                qval = y.left if y.left else None
                pp.appendleft(pval)
                qq.appendleft(qval)
                pval = x.right if x.right else None
                qval = y.right if y.right else None
                pp.appendleft(pval)
                qq.appendleft(qval)
        if qq or pp:
            return False
        return True