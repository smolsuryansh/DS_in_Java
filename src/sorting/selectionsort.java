package sorting;

public class selectionsort {
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 3, 1, 2};

        // Time complexity = O(n^2), bad time for sorting
        // Selection sort
        for(int i = 0; i < arr.length-1; i++){
            int smallest = i; // starting element, which is why we will replace it later.
            for(int j = i+1; j< arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];  // send arr[smallest] to a temporary location
            arr[smallest] = arr[i]; // now arr[smallest]'s location is empty so send arr[i] to arr[smallest]'s location
            arr[i] = temp; // now send temp (arr[smallest])'s location to arr[i]
        }
        printArray(arr);
    }
}
