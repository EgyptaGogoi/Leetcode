class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length ==3)
            return nums[0]+ nums[1]+nums[2];
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int clsum= nums[0]+ nums[1]+nums[2];
        for(int i = 0; i< nums.length-2; i++){
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = nums[i]+ nums[l]+nums[r];
                if(sum == target)
                    return sum;
                int dist = Math.abs(target-sum);
                if(dist<min){   
                    min = dist;
                    clsum = sum;
                }
                if (target> sum)
                    l++;
                else
                    r--;
            }
        }
        return clsum; 
    }
}

// -1 2 1 = 2
// 2 1 -4 = -1
// -1 1 -4 = 4
// -1 2 -4 = -3

// 2, -1, 4, 3

// 1 -4 = 3
// 1-2 = 1
// 1-(-1) = 0
// 1 -(-3) = 2

// -4 -1 1 2

// -4 -1 2 = -3
// (1--3) -> 4 > target = r--
// -4 -1 1 = 4
// (1-4) -> -3 < target l++
