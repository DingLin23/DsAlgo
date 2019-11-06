package AmazonOaDebug;
import java.util.Arrays;

//time: o(nlgn);
//space: o(1)
class TwoSum_UniquePairs{
    public static int getUniquePairs(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int ans = 0;
        while (i < j){
            int sum = nums[i]+ nums[j];
            if (sum < target){
                i++;
            } else if (sum > target){
                j--;
            } else {
                ans++;
                i++;
                j--;
                while (i < j && nums[i] == nums[i-1]){
                    i++;
                }
                while (i < j && nums[j] == nums[j+1]){
                    j--;
                }
            }
        }
        return ans;
    }
//    time:O(n)
    //space:o(n^2)

//    public static int getUniquePairsOpti(int[] nums, int target){
//        Set<Integer> seen =  new HashSet<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        int ans = 0;
//        for (int num : nums){
//            if (map.containsKey(num)){
//                int key = map.get(num)*10 + num;
//                if (! seen.contains(key)){
//                    ans++;
//                    seen.add(key);
//                }
//            } else {
//                map.put(target-num, num);
//            }
//        }
//        return ans;
//
//    }


    public static void main (String args[]){
        int [] nums = {1,3,2,2,4,0};
        int target = 4;
        System.out.println(getUniquePairs(nums,target));
    }
}