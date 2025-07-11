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
        currA = headA
        currB = headB
        
        while currA != currB:
            if currA:
                currA = currA.next
            else:
                currA = headB
            if currB:
                currB = currB.next
            else:
                currB = headA
        return currA
        