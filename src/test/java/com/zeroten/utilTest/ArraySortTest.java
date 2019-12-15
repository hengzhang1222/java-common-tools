package com.zeroten.utilTest;


import org.junit.Test;

import java.util.Arrays;

/**
 * Created by 恒 on 2019/12/13.
 */
public class ArraySortTest {

   @Test
   public void sortTest(){
        int[] arr = {2,5,1,7,9,33,99,201,3,6,8};
        int tmp ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i] < arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
   @Test
   public void sortTest2(){
        int[] arr = {2,5,1,7,9,33,99,201,3,6,8};
        int tmp ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i] > arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
   }

}
