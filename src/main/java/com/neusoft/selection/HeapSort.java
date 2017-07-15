package com.neusoft.selection;
/**
 * 选择排序中的堆排序：
 * 主要分两个步骤：构造堆结构和堆排序输出。
 * 使用筛运算，由完全二叉树的下层向上层逐层堆父子结点的数据进行比较，使父结点的数据大于子结点的数据；	
 * 在完成一轮比较后，完全二叉树的根结点为最大，将根结点的元素和树的最后一位交换，
 * 交换后之前经过筛运算的树的父结点的数据大于子结点的数据的规则被破坏，需要再次对树进行构建使其符合规则，再选出其中最大的元素
 * @author daibiao
 *
 */
public class HeapSort {
	public static void sort(int[] array, int n) {
		int i, j, k;
		int temp;
		//构建符合父结点大于子结点规则的完全二叉树
		for (i = n/2-1; i >= 0; i--) {         //找到非叶子结点并遍历
			while(i*2+1 < n) {         //判断非叶子结点是否存在左子结点
				j = i*2+1;
				if(j+1 < n) {        //判断非叶子结点是否存在右子结点
					if(array[j] < array[j+1]) {      //判断左右子结点大小，选择其中大的一方
						++j;
					}
				}
				if(array[i] < array[j]) {      //将左右子结点大的一方与非叶子结点父结点比较，并交换
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					i = j;                 //由于交换破坏了规则需要将交换的子结点的子树再进行按照前面的方式构建
				}else {
					break;          //如果满足规则则跳出循环
				}
			}
		}
		for (i = n-1; i > 0; i--) {        //完成排序需要n-1轮
			temp = array[0];                //将array[0]和每次比较的最后一个交换
			array[0] = array[i];
			array[i] = temp;
			k = 0;
			while(k*2+1 < i) {               //和之前的一样
				j = k*2+1;
				if(j+1 < i) {
					if(array[j] < array[j+1]) {
						++j;
					}
				}
				if(array[k] < array[j]) {
					temp = array[k];
					array[k] = array[j];
					array[j] = temp;
					k = j;
				}else {
					break;
				}
			}
		}
	}
}
