package com.neusoft.insertion;
/**
 * 插入排序中的Shell排序：
 * 将数组划分为组排序，将划分好的组按照插入排序来排序。
 * @author daibiao
 *
 */
public class ShellSort {
	public static void sort(int[] array) {
		int i, j;
		int r, temp;
		for (r = array.length/2; r >= 1; r/=2) {
			for (i = r; i < array.length; i++) {
				temp=array[i];
				j=i-r;
				while(j >=0 && temp < array[j]) {
					array[j+r] = array[j];
					j-=r;
				}
				array[j+r]=temp;
			}
		}
	}
}
