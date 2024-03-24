public class LinearSearch {
    public static int search(int arr[], int x) {
        int n = arr.length;//Checks the length of the array to see how many times the for loop will run
        // Todo 01: - complete the implementation of linear search and test your code
        //         - prvoide asymptotic analysis of the developed solution
        for (int a = 0; a < n; a++) { //Starts at 0,and increases by 1 until it is less than n/the length of the array
            if (arr[a] == x) { //each time the for loop runs, it checks to see what is in that spot of the array, if the spot matches the target number then it returns its spot
                return a;
            }
        }
        return -1; //If the target number is not found, then -1 is returned, which would be put to show nothing found
    }
}
