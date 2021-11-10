public class sortingTest{

  public static void displayArray(int[] arr){
    for (int i = 0; i < arr.length; i++)
      System.out.printf("%d ", arr[i]);
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {12, 37, 6, 14, 25, 34, 17};
    // int[] arr = {5, 2, 4, 6, 1, 3};

    displayArray(arr);
    System.out.println("");

    for (int i = 1; i < arr.length; i++){
      for (int j = i; j > 0; j--){
        System.out.printf("i = %d\n", i);
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
      // displayArray(arr);
    }

    System.out.println("Final Array:");

    displayArray(arr);
  }
}
