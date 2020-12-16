class Point2 {
  private int xPos;
  private int yPos;

  public Point2(int x, int y) {
    xPos = x;
    yPos = y;
  }

  public boolean equals(Object obj) {
    Point2 p = (Point2) obj;

    if (xPos == p.xPos && yPos == p.yPos)
      return true;
    else
      return false;
  }
}

class Rectangle {
  private Point2 upperLeft;
  private Point2 lowerRight;

  public Rectangle(int x1, int y1, int x2, int y2) {
    upperLeft = new Point2(x1, y1);
    lowerRight = new Point2(x2, y2);
  }

  public boolean equals(Object obj) {
    Rectangle r = (Rectangle) obj;

    if (upperLeft.equals(r.upperLeft) && lowerRight.equals(r.lowerRight))
      return true;
    else
      return false;
  }
}

class Q19_1 {
  public static void main(String[] args) {
    Point2 p1 = new Point2(5, 6);
    Point2 p2 = new Point2(5, 6);

    Rectangle r1 = new Rectangle(1, 2, 8, 9);
    Rectangle r2 = new Rectangle(2, 2, 8, 9);

    if (p1.equals(p2))
      System.out.println("같음");
    else
      System.out.println("다름");

    if (r1.equals(r2))
      System.out.println("같음");
    else
      System.out.println("다름");
  }
}