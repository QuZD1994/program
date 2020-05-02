package com;

public class Solution_有序数组的平方 {

    public static int[] sortedSquares(int[] A){
        int[] res = new int[A.length];
        int index = A.length - 1;
        int left = 0;
        int right = A.length - 1;
        while (left <= right){
            if (A[left] * A[left] < A[right] * A[right]){

                res[index] = A[right] * A[right];
                right--;
            } else {
                res[index] = A[left] * A[left];
                left++;
            }
            index--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {-4,-1,0,3,10};
        int[] res = sortedSquares(A);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
