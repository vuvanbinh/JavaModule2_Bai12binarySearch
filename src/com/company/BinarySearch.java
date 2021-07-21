package com.company;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 99, 50,1, 59, 60, 66, 69, 70, 79};



    static int binarySearch(int[] list , int key){
        int low = 0;
        int high = list.length-1;
        while(high>=low){
            int mid = (low+high)/2;
            if(key <list[mid]) high = mid -1;
            else if(key == list[mid]) return mid;
            else low= mid+1;
        }
        return -1;
    }


    public static void main(String[] args) {

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if(list[i]<list[j]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println("tim thay 2 tai vi tri thu " + binarySearch(list,2));
        System.out.println("tim thay 11 tai vi tri thu " + binarySearch(list,11));
        System.out.println("tim thay 99 tai vi tri thu " + binarySearch(list,99));
        System.out.println("tim thay 1 tai vi tri thu " + binarySearch(list,1));
        System.out.println("tim thay 5 tai vi tri thu " + binarySearch(list,5));
        System.out.println("tim thay 80 tai vi tri thu " + binarySearch(list,80));
    }
}
