package main.java.com.sindhuk.datastructure.searching.javalibrary;

/**
 * Created by asraful on 10/1/2017.
 */

/*
Time Complexity: T(n) = T(n/2) + c => O(log(n))
Auxiliary Space: O(1)
*/


// Java implementation of iterative Binary Search
class BinarySearch
{
    // Returns index of x if it is present in matrix[][], else
    // return -1
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int row = matrix.length;
        int i,j,m;
        int l = 0, r = row*col - 1;
        while (l <= r)
        {
            m = l + (r-l)/2;
            i = m/col;
            j = m%col;

            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] < target)
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }

    // Returns index of x if it is present in arr[], else
    // return -1
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r)
        {
            int m = l + (r-l)/2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was not present
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
    }
}