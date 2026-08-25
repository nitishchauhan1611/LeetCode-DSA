class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();

        for(int num : nums){
            s.add(num);
        }

        int multi=k;

        while(s.contains(multi)){
            multi +=k; 
        }

        return multi;
    }
}