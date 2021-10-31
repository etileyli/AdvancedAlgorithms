public class sortingTest{

  public static void displayArray(int[] arr){
    for (int i = 0; i < arr.length; i++)
      System.out.printf("%d ", arr[i]);
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {12, 37, 6, 14, 25, 34, 17};

    for (int i = 1; i < arr.length; i++){
      for (int j = 0; j <= i; j++){
        if (arr[i] < arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      displayArray(arr);
    }

    System.out.println("Final Array:");

    displayArray(arr);
  }
}
