package com.example.algorithm4booknotes.chapter_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 二分法查找
 */
public class BinarySearchTest {

    /**
     * 判断目标值是否在区间内
     * @param key 取到的地N个值
     * @param a 必须是一个有序数组
     * @return
     */
    public static int rank(int key,int[] a){
        /*从第一项到中间项查询*/
        int star = 0;
        int end = a.length-1;//从0开始
        while (star <= end){
            int mid = star + (end-star)/2;
            if (key < a[mid]) end = mid -1;//重置末端位置
            else if (key > a[mid]) star = mid+1;//充值开始位置
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        //从输入参数中获取txt文本中所有int值
        int[] writeList = In.readInts(args[0]);
        //对读取的信息进行排序，确定为有序数组
        Arrays.sort(writeList);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (rank(key,writeList) <0){
                StdOut.println(key);
            }
        }
    }


}
