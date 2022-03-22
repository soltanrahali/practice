import java.util.Arrays;
import java.util.HashMap;

public class Sum2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums={2,7,11,15};
		System.out.println(Arrays.toString(twoSum(nums,9)));
		
		

	}
	
	public static int[] twoSum(int [] nums, int target) {
		
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
        	
        	int complement=target-nums[i];
        	if(!map.containsKey(complement)) {
        		map.put(nums[i], i);
        	}else {
        		int[] pair= {i,map.get(complement)};
        		return pair;
        	}
        }
		
		
		return null;
	}

}
