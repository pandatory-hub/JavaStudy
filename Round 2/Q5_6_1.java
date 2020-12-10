public class Q5_6_1 {
  public static void main(String[] args) {
    int cnt = 0;

    for (int i = 1; i <= 100; i++) {
      if ((i % 5) != 0 || (i % 7) != 0)
        continue;
      cnt++;
      System.out.println(i);
    }
    System.out.println(cnt);
  }
}
