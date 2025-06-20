# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteMiddle(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if not head.next :
            return 
        slow = fast = head
        c = 0
        while fast.next:
            fast = fast.next
            c += 1
        c = (c-1)//2
        while c:
            slow = slow.next
            c -= 1
        slow.next = slow.next.next
        return head

            
        