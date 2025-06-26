class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        n = x
        newx = 0
        while n > 0:
            dig = n % 10
            newx  = ((newx * 10) + dig)
            n = n // 10
        if newx == x :
            return True
        return False

            
        