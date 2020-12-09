class Car {
  int gasolineGauge;

  public Car(int ga) {
    this.gasolineGauge = ga;
  }
}

class HybridCar extends Car {
  int electronicGauge;

  public HybridCar(int ga, int ele) {
    super(ga);
    this.electronicGauge = ele;
  }
}

class HybridWaterCar extends HybridCar {
  int waterGauge;

  public HybridWaterCar(int ga, int ele, int wat) {
    super(ga, ele);
    this.waterGauge = wat;
  }

  public void showCurrentGauge() {
    System.out.println("잔여 가솔린: " + gasolineGauge);
    System.out.println("잔여 전기량: " + electronicGauge);
    System.out.println("잔여 워터량: " + waterGauge);
  }
}

public class ConstructorAndSuper {
  public static void main(String[] args) {
    HybridWaterCar hw1 = new HybridWaterCar(4, 2, 3);
    hw1.showCurrentGauge();
  }
}
