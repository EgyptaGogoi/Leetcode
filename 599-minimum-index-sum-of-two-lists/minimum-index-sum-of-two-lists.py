class Solution(object):
    def findRestaurant(self, list1, list2):
        """
        :type list1: List[str]
        :type list2: List[str]
        :rtype: List[str]
        """
        index_map = {word: i for i, word in enumerate(list1)}
        min_sum = float('inf')
        result = []

        for j, word in enumerate(list2):
            if word in index_map:
                total_index = j + index_map[word]
                if total_index < min_sum:
                    min_sum = total_index
                    result = [word]
                elif total_index == min_sum:
                    result.append(word)

        return result