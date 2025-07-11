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
        if not headA or not headB:
            return None

        currA = headA
        currB = headB

        while currA is not currB:
            currA = currA.next if currA else headB
            currB = currB.next if currB else headA

        return currA
        