# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reversedList(self, head):
        prev = None
        curr = head
        # suppose curr is at 2
        while curr:
            # next node to go (1->2->3 so 3)
            nexnode = curr.next 
            # change the next to point to the previous node (e.g. 2->1->X)
            curr.next = prev
            # next time the prev should be curr
            prev = curr
            # move curr to next node (4)
            curr = nexnode
        # we dont return curr as curr is 
        # at None so previous of curr is prev
        return prev 

    def isPalindrome(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: bool
        """
        oldlist= ListNode(head.val)
        oldcurr= head.next
        newcurr=oldlist
        while oldcurr :
            # if revlist.val != head.val :
            #     return false
            newcurr.next= ListNode(oldcurr.val)
            oldcurr=oldcurr.next
            newcurr=newcurr.next
        # while oldlist:
        #     print(str(oldlist.val)+"->") 
        #     oldlist=oldlist.next
        # print("\n")
        # curr=head
        revlist = self.reversedList(head)
        while revlist :
            if revlist.val != oldlist.val :
                return False
        #     print(str(dummy.val)+"->")
            revlist = revlist.next
            oldlist = oldlist.next
        return True       