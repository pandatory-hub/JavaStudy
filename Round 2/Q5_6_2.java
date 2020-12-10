public class Q5_6_2 {
  public static void main(String[] args) {
    int sum = 0;

    for (int n = 1; true; n++) {
      if (n % 2 != 0)
        sum += n;
      if (sum > 1000) {
        System.out.println(n);
        System.out.println(sum);
        break;
      }
    }
  }
}
