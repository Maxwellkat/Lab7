package org.example;

public class Main {
    public static void main(String[] args) {
        //Problem two implementation in main
        int[] sortedArray = {1, 2, 3, 4, 5, 6};
        int key = 3;
        int index=BinarySearch.runBinarySearchIteratively(sortedArray, key, 0, sortedArray.length - 1);
        //The index int then gives us the index of the array showing the solution
        //The time complexity of the algorithim would be O(log n), amd tje reasoning is because it sorts by first halfing the first array,EX it starts at 16, it would then go to 8, and so forth until it finds the key its looking for
        //For Space, it would be O(1) because there are no changing pieces, and only constant numbers

        int[] arr={10,3,8,2,89,32,99,90};
        int size=arr.length;
        BubbleSort.bubbleSort(arr,size);
        for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
//The array will now be printed in highest to lowest or lowest to highest based on what is being checked, and for complexity, it would be O(n^2)
    }
int n=10;
        System.out.println(Problem01.getSumOfPrimes(n));
        //prints out the total of the prime numbers based on n, therefor, the time complexity is O(n*squareroot of n), and the reasoning is because the first n comes from the size we are checking, and then each iteration it square roots the n
        //The space complexity would be O(1), because it takes up constant space

}
}