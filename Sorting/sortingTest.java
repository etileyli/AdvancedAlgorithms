import java.util.*;

public class sortingTest{

  public static void displayArray(int[] arr){
    for (int i = 0; i < arr.length; i++)
      System.out.printf("%d ", arr[i]);
    System.out.println();
  }

  public static void insertionSort(int[] arr){

    for (int i = 1; i < arr.length; i++){
      for (int j = i; j > 0; j--){
        System.out.printf("i = %d, ", i);
        System.out.printf("j = %d\n", j);
        if (arr[j] < arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
          System.out.printf("Swap!\n");
        }
        else{
          System.out.printf("NO Swap!\n");
        }
        displayArray(arr);
        System.out.println("");
      }
    }
  }

  public static void insertionSortDecreasingOrder(int[] arr){

    for (int i = 1; i < arr.length; i++){
      for (int j = i; j > 0; j--){
        System.out.printf("i = %d, ", i);
        System.out.printf("j = %d\n", j);
        if (arr[j] >= arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
          System.out.printf("Swap!\n");
        }
        else{
          System.out.printf("NO Swap!\n");
        }
        displayArray(arr);
        System.out.println("");
      }
    }
  }

  public static int[] mergeSort(int[] arr)
  {
    int[] subArr_1 = Arrays.copyOfRange(arr, 0, arr.length/2);
    int[] subArr_2 = Arrays.copyOfRange(arr, arr.length/2, arr.length);

    if (subArr_1.length == 1 || subArr_2.length == 1){
      displayArray(subArr_1);
      displayArray(subArr_2);
      return arr;
    }

    subArr_1 = mergeSort(subArr_1);
    displayArray(subArr_1);
    subArr_2 = mergeSort(subArr_2);
    displayArray(subArr_2);

    int[] tempArr = new int[subArr_1.length + subArr_2.length];
    int i = 0, j = 0, k = 0, counter = 0;

    System.out.printf("Length of tempArr = %d\n", tempArr.length);
    while( (i < subArr_1.length + subArr_2.length) && (j < subArr_1.length ) && (k < subArr_2.length)){
      // System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
      if (subArr_1[j] < subArr_2[k])
        tempArr[i++] = subArr_1[j++];
      else
        tempArr[i++] = subArr_2[k++];
      System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
    }

    // System.out.printf("i: %d\n", i);

    System.out.println("tempArr");
    displayArray(tempArr);
    return tempArr;
  }

  public static void main(String[] args) {
    // int[] arr = {12, 37, 6, 14, 25, 34, 17};
    // int[] arr = {5, 2, 4, 6, 1, 3};

    int[] arr = {12, 37, 14, 6, 34, 25, 17, 23};


    System.out.println("Initial Array:");
    displayArray(arr);
    System.out.println("");

    // insertionSort(arr);
    // insertionSortDecreasingOrder(arr);
    arr = mergeSort(arr);

    System.out.println("Final Array:");
    displayArray(arr);
  }
}
