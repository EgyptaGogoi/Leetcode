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
        ln = 1
        while curr.next:
            curr = curr.next
            ln += 1
        rot = k % ln
        index_tail = ln - rot 
        curr.next = head 
        new_tail = curr 
        while index_tail:
            new_tail = new_tail.next
            index_tail -= 1
        newhead = new_tail.next
        new_tail.next = None
        return newhead
            