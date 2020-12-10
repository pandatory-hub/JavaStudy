class Triangle {
  double bot;
  double hei;

  public Triangle(double b, double h) {
    bot = b;
    hei = h;
  }

  public void changeB(double b) {
    bot = b;
  }

  public void changeH(double h) {
    hei = h;
  }

  public double getArea() {
    return bot * hei / 2;
  }

}

public class Q7_1 {
  public static void main(String[] args) {
    Triangle tr = new Triangle(4.2, 5.2);
    System.out.println(tr.getArea());

    tr.changeB(3.2);
    tr.changeH(4.2);
    System.out.println(tr.getArea());
  }
}