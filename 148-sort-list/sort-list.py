# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def sortList(self, head):
        if not head or not head.next:
            return head
        
        # Step 1: Split the list into two halves using slow and fast pointers
        slow = head
        fast = head.next  # ensures splitting at mid
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        
        mid = slow.next
        slow.next = None  # break the list into two parts

        # Step 2: Recursively sort both halves
        left = self.sortList(head)
        right = self.sortList(mid)

        # Step 3: Merge the sorted halves
        return self.merge(left, right)
    
    def merge(self, l1, l2):
        dummy = ListNode()
        tail = dummy

        while l1 and l2:
            if l1.val < l2.val:
                tail.next = l1
                l1 = l1.next
            else:
                tail.next = l2
                l2 = l2.next
            tail = tail.next
        
        # Attach the remaining elements
        if l1:
            tail.next = l1
        else:
            tail.next = l2
        
        return dummy.next
