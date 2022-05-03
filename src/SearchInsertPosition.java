
public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
		if (nums == null) {
			return 0;
		} else if (target > nums[nums.length - 1]) {
			return nums.length;
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (target <= nums[i]) {
					return i;
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 3, 5, 6 };
		int target = 5;
		System.out.println(searchInsert(nums, target));
	}

}
