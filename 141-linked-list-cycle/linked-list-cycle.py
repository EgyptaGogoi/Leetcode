# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        # if (not head) or (not head.next) or (not head.next.next):
        if not (head and head.next and head.next.next):
            return False
        fast = head.next.next
        slow = head
        while fast and fast.next:
            if slow == fast:
                print(slow)
                return True
            slow = slow.next
            fast = fast.next.next
        return False       
        