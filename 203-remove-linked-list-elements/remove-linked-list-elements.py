# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: Optional[ListNode]
        :type val: int
        :rtype: Optional[ListNode]
        """
        nlist= ListNode(0)
        curr= nlist
        while head is not None:
            if head.val != val:
                curr.next=head
                curr=curr.next
            head=head.next
        curr.next = None
        return nlist.next