package java_core1;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {10,100,21,56,65,34,22,41,16,33,74};
        printArray(arr);

        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i > 0){
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
        System.out.println();
    }
}
