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
                asc = 97 if ch == 'z' else ord(ch)+1
                neword += chr(asc)
            word += neword
            print(word)
        return word[k-1]