import java.util.Arrays;

public class Assignment4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        System.out.println("Original Array: " + Arrays.toString(arr));
        //Task 1: Update value at index 3
        int[] arr1 = {0, 1, 2, 3, 4};
        updateArray(arr1, 3, 10);
        System.out.println("After Update : " + Arrays.toString(arr1));
        //Task 2:  Insertion
        int[] arr2 = {0, 1, 2, 3, 4};
        insertArray(arr2, 1, 10);
        System.out.println("After insert : " + Arrays.toString(arr2));
        //Task 3: Delete value at index 3
        int[] arr3 = {0, 1, 2, 3, 4};
        arr3 = deleteArray(arr3, 3);
        System.out.println("after delete : " + Arrays.toString(arr3));
        //Task 4: swap value at index 1 and 3
        int[] arr4 = {0, 1, 2, 3, 4};
        arr4 = swapArray(arr4, 1, 3);
        System.out.println("After Swapped: " + Arrays.toString(arr4));
        //Task 5: right shift
        int[] arr5 = {0, 1, 2, 3, 4};
        arr5 = rightShiftArray(arr5);
        System.out.println("After Right Shifted : " + Arrays.toString(arr5));
    }

    //Task 1: Update value at index 3
    public static int updateArray(int[] arr, int index, int value) {
        arr[index] = value;
        return arr[index];
    }

    //Task 2:  Insertion
    public static int insertArray(int[] arr, int index, int newValue) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = newValue;
        return arr[index];
    }

    //Task 3: Delete value at index 3
    public static int[] deleteArray(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        // Create new array
        int[] newArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) { // skip element at index
                continue;
            }
            newArray[k++] = arr[i];
        }
        return newArray;
    }

    //Task 4: swap value at index 1 and 3
    public static int[] swapArray(int[] arr, int index1, int index3) {
        int temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;
        return arr;
    }

    //Task 5: right shift
    public static int[] rightShiftArray(int[] arr) {
        int last = arr[arr.length - 1];
        if (arr.length > 1) {
            //Shift every element one place to the right.
            for (int index = arr.length - 2; index >= 0; index--) {
                arr[index + 1] = arr[index];
            }
        }
        arr[0] = last;
        return arr;
    }
}
