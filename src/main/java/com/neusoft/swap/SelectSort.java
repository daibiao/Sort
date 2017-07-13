package com.neusoft.swap;

/**
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
