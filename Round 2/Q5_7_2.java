public class Q5_7_2 {
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        sum = i + j;
        if (sum == 9)
          System.out.println("i = " + i + ", j = " + j);
      }
    }
  }
  // for(int i = 0; i < 10; i++) {
  // for(int j = 0; j < 10; j++) {
  // if((i * 10 + j) + (j * 10 + i) == 99)
  // System.out.println(i + ", " + j);
  // }
  // }
}
