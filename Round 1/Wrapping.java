class Box {
  public void wrap() {
    System.out.println("Simple Wrapping");
  }
}

class PaperBox extends Box {
  public void wrap() {
    System.out.println("Paper Wrapping");
  }
}

class GoldPaerBox extends PaperBox {
  public void wrap() {
    System.out.println("Gold Wrapping");
  }
}

public class Wrapping {
  public static void main(String[] args) {
    Box box1 = new Box();
    PaperBox box2 = new PaperBox();
    GoldPaerBox box3 = new GoldPaerBox();

    wrapBox(box1);
    wrapBox(box2);
    wrapBox(box3);
  }

  public static void wrapBox(Box box) {
    box.wrap();
  }
}
