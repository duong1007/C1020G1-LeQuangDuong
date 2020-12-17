package search_algorithm.bai_tap;

public class BinarySearchRecur {
    static int binarySearch(int arr[], int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {
                return binarySearch(arr, low, mid - 1, key);
            }

            return binarySearch(arr, mid + 1, high, key);
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40};
        int high = arr.length - 1;
        int result = binarySearch(arr, 0, high, 10);
        if (result == -1)
            System.out.println("Không tìm thấy phần tử " + 10);
        else
            System.out.println("Phần tử " + 10 + " được tìm thấy tại chỉ số " + result);
    }
}