# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def getDecimalValue(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: int
        """
        ans=0
        if head.val == 0 and head.next is None:
            return ans
        lenn=0
        curr=head
        while curr.next is not None:
            lenn+=1
            curr=curr.next
        lenn+=1
        curr=head
        while curr.next is not None: 
            ans= ans+curr.val * (2 ** (lenn-1))
            lenn-=1
            curr=curr.next
        ans= ans+curr.val * (2 ** (lenn-1))
        return ans
        
        