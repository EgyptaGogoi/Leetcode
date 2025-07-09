# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def partition(self, head, x):
        """
        :type head: Optional[ListNode]
        :type x: int
        :rtype: Optional[ListNode]
        """
        newhead = less = ListNode()
        link = more = ListNode()
        curr = head
        while curr:
            if curr.val < x:
                less.next = ListNode(curr.val)
                less = less.next
            else:
                more.next = ListNode(curr.val)
                more = more.next
            curr = curr.next
        less.next = link.next
        return newhead.next

        
