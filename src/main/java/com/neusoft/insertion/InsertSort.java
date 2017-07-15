package com.neusoft.insertion;
/**
 * 插入排序中的插入排序：
 * 从数组的第二个元素开始至最后一个，取出其元素值并与该元素前面的元素挨个比较，
 * 如果前面的元素比取出的元素大，则将该元素往后移一位，比较至数组第一位为止，
 * 由于下标移动时多减了一位，在将取出元素插入到指定位置时，需要给下标加1。
 * @author daibiao
 *
 */
public class InsertSort {
	public static void sort(int[] array) {
		int i, j;
		int temp;
		for (i = 1; i < array.length; i++) {
			temp = array[i];
			j = i-1;
			while(j >= 0 && temp < array[j]) {
				array[j+1] = array[j];
				--j;
			}
			array[j+1]=temp;
		}
	}
}
