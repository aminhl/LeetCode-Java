class Solution {
    public boolean containsDuplicate(int[] nums) {
	// Better Approach
     HashSet<Integer> hashSet = new HashSet<>();
        for (int e : nums) hashSet.add(e);
        return hashSet.size() != nums.length;
    }
	/* 
	   * Other Solution
	Arrays.sort(nums);
        for (int i = 1; i <nums.length ; i++)
            if (nums[i] == nums[i-1]) return true;
        return false;
	*/ 
}