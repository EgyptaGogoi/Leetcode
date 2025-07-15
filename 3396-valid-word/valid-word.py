class Solution(object):
    def hasSpec(self, w):
        return any(not ch.isalnum() for ch in w)
    # def hasNumbers(self, w):
    #     return any(ch.isdigit() for ch in w)
    def hasVowelsConson(self, w):
        vowels = set('aeiouAEIOU')
        has_vowel = False
        has_consonant = False
        for ch in w:
            if ch.isalpha():
                if ch in vowels:
                    has_vowel = True
                else:
                    has_consonant = True
        return has_vowel, has_consonant
    # def hasUpper(self, w):
    #     return any(ch.isupper() for ch in w)
    # def hasLower(self, w):
    #     return any(ch.islower() for ch in w)
    def isValid(self, word):
        """
        :type word: str
        :rtype: bool
        """
        v,c = self.hasVowelsConson(word)
        # print(self.hasUpper(word))
        # print(self.hasLower(word)) 
        print(len(word)<3) 
        # print(self.hasNumbers(word)) 
        print(v,c)
        print(self.hasSpec(word))
        # if self.hasUpper(word) or self.hasLower(word) and len(word)>=3 or self.hasNumbers(word) and (v or c) and self.hasSpec(word):
        #     return True
        # return False
        if len(word)<3 or self.hasSpec(word):
            return False
        v,c = self.hasVowelsConson(word)
        return v and c