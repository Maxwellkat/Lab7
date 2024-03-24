package org.example;

public class BubbleSort {
    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if(a[inner]<a[inner+1]){
                //The way bubble sorting works is by grouping up two numbers, comparing, and placing the bigger one next, and continuing the pattern
                temp=a[inner];
                a[inner]=a[inner+1];
                a[inner+1]=temp;
                //ToDo 3: complete this algorithm, test it, provide its time complexity
            }
        }
    }
        //



}}
