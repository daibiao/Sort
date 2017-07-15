package com.neusoft.selection;

/**
 * 选择排序中的选择排序：
 * 选择排序每一轮都会从数组中选出最小的元素，从数组最左边开始依次放置这些从剩余数组中选出的最小元素。
 * 第一轮的最小元素从下标1~a.length-1中选出并和下标0的元素比较，最小元素放在下标0处；
 * 第二轮的最小元素从下标2~a.length-1中选出并和下标1的元素比较，最小元素放在下标1处；
 * 
 * @author daibiao
 *
 */
public class SelectSort {
	public static void sort(int[] array) {
		int index, temp;
		for (int i = 0; i < array.length - 1; i++) {
			index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			if (index != i) {
				temp=array[i];
				array[i] = array[index];
				array[index] = temp;
			}
		}
	}
}
