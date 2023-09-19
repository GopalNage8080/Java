import java.util.Arrays;

public class OneDuplicate {
	public int findDuplicate(int[] nums) {
		int dup = 0;

		//This will sort the array list 
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				//after sorting it is very easy to find the duplicates
                  dup = nums[i];
			}

		}
		return dup;    //this returns the duplicate element
	}

	public static void main(String args[]) {
		OneDuplicate so = new OneDuplicate();
		int[] nums = { 3, 1, 3, 4, 2 };
		System.out.println(so.findDuplicate(nums));
	}
}
