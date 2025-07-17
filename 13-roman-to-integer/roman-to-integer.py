class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        roman = {
            "I":1,
            "V":5,
            "X":10,
            "L":50,
            "C":100,
            "D":500,
            "M":1000
        }
        sum = 0
        i = 0
        while i< len(s):
            if s[i] == 'I'and i+1 <len(s) and s[i+1] in {'V', 'X'}:
                    sum += roman[s[i+1]] - roman[s[i]]
                    i+=2
            elif s[i] == 'X' and i+1<len(s) and s[i+1] in {'L', 'C'}:
                    sum += roman[s[i+1]] - roman[s[i]]
                    i+=2
            elif s[i] == 'C'and i+1<len(s) and s[i+1] in {'D', 'M'}:
                    sum += roman[s[i+1]] - roman[s[i]]
                    i+=2
            else:
                sum+= roman[s[i]]
                i+=1

        return sum

          