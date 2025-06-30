# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def revL(self, start, end, end_next):
        curr = start
        prev = end_next
        while curr != end:
            nextNode = curr.next
            curr.next = prev
            prev = curr
            curr = nextNode

        curr.next = prev
        return curr
    def reverseBetween(self, head, left, right):
        """
        :type head: Optional[ListNode]
        :type left: int
        :type right: int
        :rtype: Optional[ListNode]
        """
        if left == right:
            return head
        curr = newhead = head 
        ln = 1
        start = curr
        end = None
        while curr:
            ln += 1
            curr = curr.next
            if ln == left:
                start = curr
            if ln == right:
                end = curr
                break
        link_last_node = end.next
        # print (link_last_node)
        if left == 1:
            newhead = self.revL(start,end,link_last_node)
        else :
            newstart = newhead
            while newstart.next != start:
                newstart=newstart.next
            newstart.next = self.revL(start, end,link_last_node)
            # print(newstart)
        return newhead
        