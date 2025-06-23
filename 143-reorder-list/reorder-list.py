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
        curr = head
        len = 0
        while curr:
            len+=1
            curr=curr.next
        len = len//2 +1 if len%2==1 else len//2  
        
        mid = head
        for i in range(1,len):
            mid = mid.next
        
        curr2= self.revList(mid.next)
        mid.next= None
        curr1=head
        
        while curr1 and curr2:
            newNext = curr2.next
            curr2.next = curr1.next
            curr1.next=curr2
            curr2=newNext
            curr1= curr1.next.next
        



