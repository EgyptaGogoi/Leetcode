# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def revList(self, l1):
        curr=l1
        prev= None
        while curr:
            nextNode = curr.next
            curr.next=prev
            prev = curr
            curr = nextNode
        return prev
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        num1=0
        num2=0
        l1 = self.revList(l1)
        l2 = self.revList(l2)
        while l1:
            num1 = (num1*10) + l1.val
            l1=l1.next
        while l2:
            num2 = (num2*10) + l2.val
            l2=l2.next
        sum= num1 +num2
        
        if sum == 0:
            return ListNode()
        l3 =curr = ListNode()
        while sum>0:
            n = sum%10
            curr.next=ListNode(n)
            curr=curr.next
            sum = sum//10
        
        return l3.next
        