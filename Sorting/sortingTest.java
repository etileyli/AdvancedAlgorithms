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

  public static void merge(int Arr[], int start, int mid, int end) {

  	// create a temp array
  	int temp[] = new int[end - start + 1];

  	// crawlers for both intervals and for temp
  	int i = start, j = mid+1, k = 0;

  	// traverse both arrays and in each iteration add smaller of both elements in temp
  	while(i <= mid && j <= end) {
  		if(Arr[i] <= Arr[j]) {
  			temp[k] = Arr[i];
  			k += 1; i += 1;
  		}
  		else {
  			temp[k] = Arr[j];
  			k += 1; j += 1;
  		}
  	}

  	// add elements left in the first interval
  	while(i <= mid) {
  		temp[k] = Arr[i];
  		k += 1; i += 1;
  	}

  	// add elements left in the second interval
  	while(j <= end) {
  		temp[k] = Arr[j];
  		k += 1; j += 1;
  	}

  	// copy temp to original interval
  	for(i = start; i <= end; i += 1) {
  		Arr[i] = temp[i - start];
  	}
  }

  // Arr is an array of integer type
  // start and end are the starting and ending index of current interval of Arr

  public static void mergeSort(int Arr[], int start, int end) {

  	if(start < end) {
  		int mid = (start + end) / 2;
  		mergeSort(Arr, start, mid);
      // displayArray(Arr);
  		mergeSort(Arr, mid+1, end);
      // displayArray(Arr);
  		merge(Arr, start, mid, end);
      displayArray(Arr);

  	}
  }

  public static void main(String[] args) {
    // int[] arr = {12, 37, 6, 14, 25, 34, 17};
    // int[] arr = {5, 2, 4, 6, 1, 3};

    // int[] arr = {12, 37, 14, 6, 34, 25, 17, 23};
    int[] arr = {37, 12, 14, 6, 34, 25, 23, 17};


    System.out.println("Initial Array:");
    displayArray(arr);
    System.out.println("");

    // insertionSort(arr);
    // insertionSortDecreasingOrder(arr);
    // arr = NOT_WORKING_mergeSort(arr);
    // mergeSort(arr, 0, 7);

    System.out.println("Final Array:");
    displayArray(arr);
  }
}
