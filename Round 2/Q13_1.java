public class Q13_1 {
  public static int maxValue(int[] arr) {
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (max < arr[i])
        max = arr[i];
    }
    return max;
  }

  public static int minValue(int[] arr) {
    int min = arr[0];

    for (int e : arr) {
      if (min > e)
        min = e;
    }
    return min;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    System.out.println("최댓값 : " + maxValue(arr));
    System.out.println("최솟값 : " + minValue(arr));
  }

}
