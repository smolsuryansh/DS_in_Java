package sorting;

public class bubblesort {
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 3, 1, 2};

        // Time complexity = O(n^2), a bad time for sorting, don't use bubble sort and inserting sort in interviews.
        // Bubble sort
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]) { // check if first kept element has bigger value than the other element
                    // Swap
                    int temp = arr[j]; // send arr[j] to a temporary location
                    arr[j] = arr[j+1]; // now arr[j]'s location is empty so send arr[j+1] to arr[j]'s location
                    arr[j+1] = temp; // now send temp (arr[j])'s location to arr[j+1]
                }
            }
        }
        printArray(arr);
    }
}
