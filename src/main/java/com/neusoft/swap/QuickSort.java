package com.neusoft.swap;

/**
 * 交换排序中的快速排序：
 * 选取数组中居中的元素作为参照点，将数组的两端的下标分别赋值给左右的游标。
 * 当左边的游标小于右边的游标，按照参照点左边比参照点小参照点右边比参照点大的原则，
 * 将左边的游标元素和参照点的值作比较，如果游标元素的值小，那么将游标向右移一位；
 * 将右边的游标元素和参照点的值作比较，如果游标元素的值大，那么僵游标向左移一位；
 * 如果左边的游标大于右边的游标，说明本轮已经比完，可以将参照点两边分开再作递归比较，
 * 如果左边的游标小于右边的游标，说明本轮还没有比完，将两边游标的值交换以满足上面左小右大的原则，
 * 将两边的游标各自移动一位再比较...
 * 
 * @author daibiao
 *
 */
public class QuickSort {
	public static void sort(int[] array, int left, int right) {
		int flag, temp;
		int ltemp,rtemp;
		flag = array[(left+right)/2];
		ltemp=left;
		rtemp=right;
		while(ltemp < rtemp) {
			while(array[ltemp] < flag) {
				++ltemp;
			}
			while(array[rtemp] > flag) {
				--rtemp;
			}
			if(ltemp <= rtemp) {
				temp=array[ltemp];
				array[ltemp]=array[rtemp];
				array[rtemp]=temp;
				++ltemp;
				--rtemp;
			}
		}
		if(ltemp == rtemp) {
			++ltemp;
		}
		if(left < rtemp) {
			sort(array, left, ltemp-1);
		}
		if(ltemp < right) {
			sort(array, rtemp+1, right);
		}
	}
}
