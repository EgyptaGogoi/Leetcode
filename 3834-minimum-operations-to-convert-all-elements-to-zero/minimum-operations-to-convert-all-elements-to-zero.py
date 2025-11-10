class Solution(object):
    def minOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        st = []
        ops = 0
        flag = 0
        for ele in nums:
            if ele == 0:
                flag = 1
            if len(st)==0:
                st.append(ele)
                ops+=1
            elif st[-1] == ele:
                continue
            elif st[-1] > ele:
                while len(st)>0 and st[-1] > ele  :
                    st.pop()
                if len(st)==0:
                    st.append(ele)
                    ops+=1
                elif st[-1]!=ele :
                    st.append(ele)
                    ops+=1
            else:
                st.append(ele)
                ops+=1  

        return ops-flag