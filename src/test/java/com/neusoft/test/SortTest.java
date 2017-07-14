package com.neusoft.test;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.neusoft.swap.BubbleSort;
import com.neusoft.swap.HeapSort;
import com.neusoft.swap.QuickSort;
import com.neusoft.swap.SelectSort;

public class SortTest {
	private int[] array;
	@Before
	public void init() {
		array=new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=new Random().nextInt(100);
		}
	}
	@Test
	public void testBubbleSort() {
		System.out.println(Arrays.toString(array));
		BubbleSort.sort(array);
		System.out.println(Arrays.toString(array));
	}
	@Test
	public void testQuickSort() {
		System.out.println(Arrays.toString(array));
		QuickSort.sort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
	@Test
	public void testSelectSort() {
		System.out.println(Arrays.toString(array));
		SelectSort.sort(array);
		System.out.println(Arrays.toString(array));
	}
	@Test
	public void testHeapSort() {
		System.out.println(Arrays.toString(array));
		HeapSort.sort(array, array.length);
		System.out.println(Arrays.toString(array));
	}
}
