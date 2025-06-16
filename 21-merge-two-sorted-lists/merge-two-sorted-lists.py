# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if list1 is None and list2 is None:
            return list1
        # elif list1 is not None or list2 is not None:
        #     return list1 if list1 is not None else list2
        elif list1 is None and list2 is not None:
            return list2
        elif list1 is not None and list2 is None:
            return list1
        else:
            curr1=list1
            curr2=list2
            if list1.val <= list2.val:
                list3 = ListNode(list1.val, None)
                curr1=list1.next
            else:
                list3 = ListNode(list2.val, None)
                curr2=list2.next
            curr3=list3
            while curr1 is not None and curr2 is not None:
                if curr1.val <= curr2.val:
                    # curr3.val=curr1.val
                    # curr3.next = None
                    
                    temp=ListNode(curr1.val, None)
                    curr3.next=temp
                    curr1=curr1.next
                else:
                    # curr3.val=curr2.val
                    # curr3.next = None
                    
                    temp=ListNode(curr2.val, None)
                    curr3.next=temp
                    curr2=curr2.next
                curr3=curr3.next
            if curr1 is not None:
                # curr3.next=curr1
                # curr3=curr3.next
                # curr1=curr1.next
                curr3.next=curr1
            if curr2 is not None:
                curr3.next=curr2
            return list3