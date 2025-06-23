# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def revList(self, head):
        curr = head
        prev = None

        while curr:
            nextNode = curr.next
            curr.next = prev
            prev = curr
            curr = nextNode
        return prev

    def reorderList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: None Do not return anything, modify head in-place instead.
        """
        fast = head
        slow = head
        while (fast.next and fast.next.next) :
            slow = slow.next
            fast = fast.next.next 
        
        
        curr2 = self.revList(slow.next)
        slow.next = None
        curr1 = head
        
        while curr1 and curr2:
            newNext1 = curr1.next
            newNext2 = curr2.next
            
            curr2.next = newNext1
            curr1.next = curr2

            curr1 = newNext1
            curr2 = newNext2
        
        



