# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def traverseList(self, head, n):
        while n>1 :
            head = head.next
            n-=1
        return head

    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if not head:
            return head
        back = head
        n=0
        while back.next is not None:
            n+=1
            back = back.next
        newhead=dummy = ListNode(back.val)
        while n>0:
            curr = self.traverseList(head, n) 
            dummy.next= ListNode(curr.val)
            dummy=dummy.next
            n-=1
            # print(str(dummy)+"->")
        dummy.next = None
        return newhead
        