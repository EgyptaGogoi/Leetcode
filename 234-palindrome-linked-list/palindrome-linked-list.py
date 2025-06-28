class Solution(object):
    def revL(self, head):
        prev = None
        curr = head
        while curr:
            nextNode = curr.next
            curr.next = prev
            prev = curr
            curr = nextNode
        return prev

    def isPalindrome(self, head):
        if not head or not head.next:
            return True

        slow = fast = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next

        second_half_start = self.revL(slow)

        first_half = head
        second_half = second_half_start
        result = True
        while second_half:
            if first_half.val != second_half.val:
                result = False
                break
            first_half = first_half.next
            second_half = second_half.next


        return result
