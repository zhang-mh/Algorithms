package com.mhzhang.AlgorithmsLearning;

import java.util.Arrays;

/**
 * 插入排序：假设左边的元素已经是有序的，将右边的元素插入到左边已排好序的合适的位置
 * 最差情况  完全逆序[5,4,3,2,1]
 * i=1 比较1次  移动一次 
 * i=2 比较2次 移动两次
 * 总的比较次数：n*(n-1)/2,总的移动次数也是如此
 * 时间复杂度：O(n*n)
 * 最好的情况：完全有序 [1,2,3,4,5]
 * 比较次数不变，依旧是n*(n-1)/2
 * 交换次数为：0
 * 时间复杂度依旧为O(n*n)
 * 虽然和最坏情况相同，但是在要排序数量少的时候会有差异
 * 特点：和数组的初始化情况相关
 * @author mhzhang
 *
 */
public class InsertionSort {
	public static void main(String[] args){
		int[] sortedArray = InsertionSort.sort(new int[]{5,2,2,1,6,9,3,0});
		System.out.println(Arrays.toString(sortedArray));
		
	}
	public static int[] sort(int[] array){
		for(int i = 1;i<array.length;i++){
			//升序排列
			for(int j=i;j>0&&array[j]<array[j-1];j--){
				//交换array[j]和array[j-1]元素的位置
				int temp = array[j-1];
				array[j-1] = array[j];
				array[j] = temp;
			}
		}
		return array;
	}
}
