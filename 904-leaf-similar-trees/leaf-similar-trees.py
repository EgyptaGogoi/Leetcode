# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def getLeafList(self, root, llist):
        if root:
            if not root.right and not root.left:
                llist.append(root.val)
            self.getLeafList(root.left,llist)
            self.getLeafList(root.right,llist)
        return


    def leafSimilar(self, root1, root2):
        """
        :type root1: Optional[TreeNode]
        :type root2: Optional[TreeNode]
        :rtype: bool
        """
        list1 = []
        list2 = []
        self.getLeafList(root1, list1)
        print(list1)
        self.getLeafList(root2, list2)
        print(list2)
        return list1 == list2
        