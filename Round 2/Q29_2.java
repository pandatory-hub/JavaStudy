import java.util.List;
import java.util.ArrayList;

class ToyPriceInfo {
  private String model;
  private int price;

  public ToyPriceInfo(String m, int p) {
    model = m;
    price = p;
  }

  public int getPrice() {
    return price;
  }

  public String getModel() {
    return model;
  }
}

public class Q29_2 {
  public static void main(String[] args) {
    List<ToyPriceInfo> ls = new ArrayList<>();
    ls.add(new ToyPriceInfo("GUN", 200));
    ls.add(new ToyPriceInfo("TEDDYYYYYYYYYYYYY", 350));

    ls.stream().filter(t -> t.getModel().length() > 10).map(t -> t.getModel()).forEach(s -> System.out.println(s));
  }
}
