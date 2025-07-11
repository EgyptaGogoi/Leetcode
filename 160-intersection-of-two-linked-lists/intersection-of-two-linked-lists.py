# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        uniqAdd = set()
        currA = headA
        currB = headB
        while currA:
            uniqAdd.add(id(currA))
            currA = currA.next
        while currB:
            if id(currB) in uniqAdd:
                return currB
            currB = currB.next
        