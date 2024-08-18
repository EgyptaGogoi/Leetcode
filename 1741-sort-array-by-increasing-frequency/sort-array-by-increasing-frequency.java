class Solution {    
    public int[] frequencySort(int[] nums) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        
        for(int elem: nums) 
            hm.put(elem, hm.getOrDefault(elem,0) + 1);
        
        Integer temp[] = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++)
            temp[i] = nums[i];
        
        Arrays.sort(temp, new Comparator<Integer>() {
        public int compare(Integer a, Integer b) {
            if(hm.get(a) == hm.get(b)){
                return b-a;
            }
            return hm.get(a) - hm.get(b);
        }
    });

        for(int i = 0; i < nums.length; i++)    
            nums[i] = temp[i];

        return nums;
    }
}

// class Solution {
//     public static void sortbyColumn(int arr[][], int col)
//     {
//         // Using built-in sort function Arrays.sort with lambda expressions
      
//       Arrays.sort(arr, (a, b) -> Integer.compare(a[col],b[col])); // increasing order
        
//     }
//     public int[] frequencySort(int[] nums) {
//         int n = nums.length;
//         List <Integer> elem = new ArrayList<Integer>();
//         List <Integer> freq = new ArrayList<Integer>();

//         Arrays.sort(nums);
//         elem.add(nums[0]);
//         freq.add(1);
//         int element = nums[0],j=0;
//         for(int i = 1; i < nums.length; i++){
//             if(nums[i]==element){
//                 int count = freq.get(j)+1;
//                 freq.set(j,count);
//                 continue;
//             }
//             elem.add(nums[i]);
//             element = nums[i];
//             freq.add(1);
//             j++;            
//         }
//         int elem_freq [][] = new int [elem.size()][2];
//         for(int i = 0; i < elem.size(); i++){
//             elem_freq[i][0] = elem.get(i);
//             elem_freq[i][1] = freq.get(i);
//         }
//         sortbyColumn(elem_freq,1);
//         for( int i = 0; i < elem.size(); i++){
//             System.out.printf("elem: %d | freq: %d\n",elem_freq[i][0],elem_freq[i][1]);
//         }
        // System.out.println(elem);
        // System.out.println(freq);
        // for(int i = 0; i < elem.length; i++){
        //     System.out.printf("%d\t",elem[i]);
        // }
        // for(int i = 0; i < elem.length; i++){
        //     System.out.printf("%d\t",freq[i]);
        // }
//         return nums;
//     }
// }
// class Solution {
//     public int[] frequencySort(int[] nums) {
//         int n=1,i=0,j=0;
//         Arrays.sort(nums);
//         while(i<nums.length-1){
//             if(nums[i]!=nums[i+1])
//                 n++;
//             i++;
//         }
//         int [] ele= new int[n];
//         int [] freq= new int[n];
//         for(i=0; i<n; i++){
//             ele[i]=nums[j];
//             freq[i]=1;
//             while( j<nums.length && ele[i]==nums[j]){
//                 freq[i]+=1;
//                 j++;
//             }
//         }
//         int k=0;
//         for(i=0; i< n; i++){
//             j=1;
//             while(j<=freq[i] && k+1 < nums.length){
//                 nums[k++]=ele[i];
//                 j++;
//             }
//         } 
//         return nums;
//     }
// }