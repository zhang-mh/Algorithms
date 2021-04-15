package com.mhzhang.AlgorithmsLearning;

import java.util.Arrays;

/**
 * 选择排序：每次从剩余的元素中选出最小的元素
 * @author mhzhang
	 * 时间复杂度计算方法：第1次  n-1次比较  
	 *                第2次 n-2次比较 a[1]和a[2,..,n]
	 *                  .    .
	 *                  .    .
	 *                第n-1次   1次比较
	 *需要进行的比较次数：(n-1)+(n-2)+...+1=(n-1)*n/2
	 *需要进行的交换次数：n-1次
	 *特点：和数据的初始顺序无关
	 *时间复杂度： O(n2)
	 */
public class SelectionSort {

	public static void main(String[] args) {
//		int[] sortedArray = SelectionSort.selectionSort(new int[]{5,2,1,6,9,3,0});
		int[] sortedArray = SelectionSort.sort(new int[]{5,2,1,6,9,3,0});
		System.out.println(Arrays.toString(sortedArray));
	}
	
	public static int[] selectionSort(int[] array){
		for(int i = 0;i<array.length;i++){        
			int smallest = array[i];             
			int smallest_index = i;
			//找到最小的元素，并记录其值和索引
			for(int j = i+1;j<array.length;j++){  
				if(array[j] < smallest){
					smallest = array[j];
					smallest_index = j;
				}	
			}
			//将最小的元素和索引为i的元素交换位置
			array[smallest_index] = array[i];
			array[i] = smallest;
		}
		return array;
	}
	public static int[] sort(int[] array){
		for(int i = 0;i<array.length;i++){
			int min = i;
			for(int j = i+1;j<array.length;j++){
				if(array[min] > array[j])
					min = j;
			}
			//交换array[i]和array[min]位置
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		return array;
	}
}
