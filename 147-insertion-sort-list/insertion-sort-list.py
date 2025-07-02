class Solution(object):
    def insertionSortList(self, head):
        if not head or not head.next:
            return head

        sorted_head = head
        curr = head.next
        sorted_head.next = None  

        while curr:
            next_node = curr.next 
            if curr.val < sorted_head.val:
                curr.next = sorted_head
                sorted_head = curr
            else:
                prev = sorted_head
                while prev.next and prev.next.val < curr.val:
                    prev = prev.next
                curr.next = prev.next
                prev.next = curr
            curr = next_node

        return sorted_head
