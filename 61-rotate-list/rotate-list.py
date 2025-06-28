# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        if k == 0 or not head:
            return head 
        curr = head
        ln = 0
        while curr:
            curr = curr.next
            ln += 1
        rot = k % ln
        curr = head.next
        prev = head
        while rot :
            while curr.next:
                curr = curr.next
                prev = prev.next
            prev.next = None
            curr.next = head
            head = curr
            curr = head.next
            prev = head
            rot-=1
        return head
            