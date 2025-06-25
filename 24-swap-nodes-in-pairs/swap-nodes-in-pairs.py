# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapPairs(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if head and head.next:
            curr1 = head
            curr2 = head.next
            head = curr2
            while curr1 and curr2:
                nextcurr1=curr2.next
                if nextcurr1 and nextcurr1.next:
                    curr1.next = nextcurr1.next
                else:
                    curr1.next = nextcurr1
                curr2.next=curr1
                curr1=nextcurr1
                if nextcurr1:
                    curr2=nextcurr1.next  
        return head
                

        