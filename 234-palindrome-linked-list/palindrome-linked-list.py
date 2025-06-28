# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def revL(self, head):
        curr = head
        prev = None
        while curr:
            nextNode = curr.next
            curr.next = prev
            prev = curr
            curr = nextNode
        return prev
    def isPalindrome(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: bool
        """
        curr1 = head
        curr2 = newhead = ListNode(head.val)
        while curr1 and curr1.next:
            curr2.next = ListNode(curr1.next.val)
            curr2 = curr2.next
            curr1 = curr1.next
        curr2 = newhead = self.revL(newhead)
        while head and newhead:
            if head.val != newhead.val:
                return False
            head = head.next
            newhead = newhead.next
        return True


        
    
        