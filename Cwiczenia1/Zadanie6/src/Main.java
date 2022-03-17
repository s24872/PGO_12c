import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int min = 100, max = 1000;
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * (max - min + 1)) + min;
        }

        System.out.println("Generated array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
