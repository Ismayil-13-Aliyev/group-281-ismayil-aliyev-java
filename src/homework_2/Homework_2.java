package homework_2;

import java.util.Arrays;

public class Homework_2 {
	public static void main(String[] args) {
		//2
		
		int[] number = {30, 23, 12, 69};
		
		int newNumner = 67;
		
		int[] result = Arrays.copyOf(number, newNumner);
		
		System.out.println(Arrays.toString(result));
		
		//3
		
		int[] numbers2 = {23, 2387193, 2384, 912, 829};
		
		int[] result2 = Arrays.copyOfRange(numbers2, 1, 3);
		
		System.out.println(Arrays.toString(result2));
		
		//4
		
		int[] nums = {67, 90, 54, 28};
		
		System.out.println(Arrays.toString(nums));
		
		//5
		
		//?
		
		//6
		
		int[] nums2 = {134, 145, 34, 435};
		
		System.out.println(Arrays.binarySearch(nums2, 34));
		
		//?
		
		//7
		
		int[] numss = {67, 52, 69, 13, 39};
		
		int[] numsss = {67, 52, 69, 13, 39};
		
		System.out.println(Arrays.equals(numss, numsss));
		
		//8
		
		//?
		
		//9
		
		int[] nums27 = {23, 902, 837, 723};
		
		int[] cloneNums27 = nums27.clone();
	}
}
