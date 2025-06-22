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

    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        if not head.next and n==1:
            return head.next
        dummy = curr = self.revL(head)
        if n == 1:
            return self.revL(curr.next)
        while curr and curr.next:
            n-=1
            if n == 1:
                curr.next = curr.next.next
            curr = curr.next
        # print(dummy)
        return self.revL(dummy)
