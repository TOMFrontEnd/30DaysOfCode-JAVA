package JavaSchoolDemo.System;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {0,1, 2, 3, 4};
        int[] arr2 = {9,9,9,9,9};
        System.arraycopy(arr1, 2, arr2, 0, 3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
