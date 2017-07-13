package com.neusoft.swap;
/**
 * 交换排序中的冒泡排序：
 * 从数组的最左边至最右边，每两个相邻元素比较。
 * 每比完一轮后元素中最大的将会像冒泡一样移动到数组的最右边，
 * 所以下一轮在比较之前去掉最大的元素，缩小比较的位置范围，减少不必要的比较以达到优化的效果。
 * 重要：由于每一轮都会得到一个最大的元素，所以i从1开始，便于j遍历的时候去掉已排好的最大的元素。
 * @author daibiao
 *
 */
public class BubbleSort {
	public static void sort(int[] array) {
		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-i; j++) {
				if(array[j] > array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
}
