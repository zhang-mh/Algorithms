package com.mhzhang.AlgorithmsLearning;
/**
 * 线性表的物理结构：顺序存储、链式存储
 * @author mhzhang
 *
 */
public class ArrayList {
	Object[] arrayList;
	int length;
	final int CAPCITY  = 10;
	//无参构造
	public ArrayList(){
		arrayList = new Object[CAPCITY];
	}
	//有参构造，自定义数组的长度
	public ArrayList(int Capcity){
		arrayList = new Object[Capcity];
	}
	/**
	 * 在线性表的第i个位置插入元素e
	 * @param arrayList
	 * @param i
	 * @param e
	 * @throws Exception 
	 */
	public void ListInsert(Object[] arrayList,int i,Object e) throws Exception{
		//1.对插入的位置i进行检查,i的取值范围[0,线性表的长度+1]
		if(i<0 || i>length+1)
			throw new Exception("插入的位置不合法");
		//2.检查数组的长度 和 线性表的长度
		if(arrayList.length == length)
			throw new Exception("没有足够的空间进行插入操作");
		//将第i个元素（下标为i-1）及其之后的元素向后移一位,关键代码,从最后一个人开始挪
		for(int j = length-1;j >= i-1;j--)
			arrayList[j+1] = arrayList[j];
		//插入元素e,线性表的长度加1
		arrayList[i] = e;
		length++;
	}
	/**
	 * 计算线性表的长度
	 * jdk中直接用一个静态属性length返回了数组的长度
	 */
	public int listLength(){
		for()
	}
	
	
}
