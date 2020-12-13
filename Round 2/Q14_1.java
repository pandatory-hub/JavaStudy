class Car {
  int gasol;

  public Car(int g) {
    this.gasol = g;
  }
}

class HybridCar extends Car {
  int ele;

  public HybridCar(int g, int e) {
    super(g);
    this.ele = e;
  }
}

class HybridWaterCar extends HybridCar {
  int water;

  public HybridWaterCar(int g, int e, int w) {
    super(g, e);
    this.water = w;
  }

  public void showCurrent() {
    System.out.print("잔여 가솔린 : " + gasol + " ");
    System.out.print("잔여 전기량 : " + ele + " ");
    System.out.println("잔여 워터량 : " + water);
  }
}

public class Q14_1 {
  public static void main(String[] args) {
    HybridWaterCar cc = new HybridWaterCar(5, 5, 5);
    cc.showCurrent();

    HybridWaterCar cc2 = new HybridWaterCar(8, 3, 6);
    cc2.showCurrent();

  }
}
