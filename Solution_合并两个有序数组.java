package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_合并两个有序数组 {

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int[] res = new int[m + n];
        if (nums1 == null){
            res = nums1;
        } else if (nums2 == null){
            res = nums2;
        } else {
            int index1 = 0;
            int index2 = 0;
            int index = 0;
            while (index1 < m && index2 < n){
                if (nums1[index1] <= nums2[index2]){
                    res[index] = nums1[index1];
                    index1++;
                    index++;
                } else {
                    res[index] = nums2[index2];
                    index2++;
                    index++;
                }
            }
            if (index1 == m){
                while (index2 < n){
                    res[index] = nums2[index2];
                    index++;
                    index2++;
                }

            }
            if (index2 == n){
                while (index1 < m){
                    res[index] = nums1[index1];
                    index++;
                    index1++;
                }
            }
        }
        nums1 = res;
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        /*for (int i = m, index = 0; i < m + n && index < n; i++, index++) {
            nums1[i] = nums2[index];
        }*/
        System.arraycopy(nums2,0, nums1, m, n);
        Arrays.sort(nums1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
    public static void main(String[] args) {

        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge2(num1, m, num2, n);
    }
}
