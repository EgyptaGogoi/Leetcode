# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reversedList(self, head):
        prev = None
        curr = head

        while curr:
            nexnode = curr.next 
            curr.next = prev
            prev = curr
            curr = nexnode
            
        return prev 

    def isPalindrome(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: bool
        """
        oldlist = ListNode(head.val)
        oldcurr = head.next
        newcurr = oldlist

        while oldcurr :
            newcurr.next= ListNode(oldcurr.val)
            oldcurr=oldcurr.next
            newcurr=newcurr.next
        
        revlist = self.reversedList(head)

        while revlist :
            if revlist.val != oldlist.val :
                return False
            revlist = revlist.next
            oldlist = oldlist.next

        return True       