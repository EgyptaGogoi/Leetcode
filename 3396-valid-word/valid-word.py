class Solution(object):
    def hasSpec(self, w):
        return any(not ch.isalnum() for ch in w)
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
    def isValid(self, word):
        """
        :type word: str
        :rtype: bool
        """
        if len(word)<3 or self.hasSpec(word):
            return False
        v,c = self.hasVowelsConson(word)
        return v and c