class Box {
  public void gold() {
    System.out.println("Simple");
  }
}

class PaperBox extends Box {
  public void gold() {
    System.out.println("Paper");
  }
}

class GoldPaperBox extends PaperBox {
  public void gold() {
    System.out.println("gold");
  }
}

class Q15_1 {
  public static void main(String[] args) {
    Box b1 = new Box();
    PaperBox b2 = new PaperBox();
    GoldPaperBox b3 = new GoldPaperBox();

    wrap(b1);
    wrap(b2);
    wrap(b3);
  }

  public static void wrap(Box box) {
    box.gold();
  }
}