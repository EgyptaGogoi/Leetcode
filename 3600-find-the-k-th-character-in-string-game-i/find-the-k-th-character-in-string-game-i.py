class Solution(object):
    def kthCharacter(self, k):
        """
        :type k: int
        :rtype: str
        """
        word = "a"
        while len(word) <= k:
            neword = ""
            for ch in word :
                asc = (ord(ch) - ord('a') + 1) % 26 + ord('a')
                neword += chr(asc)
            word += neword
        return word[k-1]