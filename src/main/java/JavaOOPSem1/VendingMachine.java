package JavaOOPSem1;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleMilk getBottleMilk(String name, double volume) {
        for (Product product : products) {
            if (product instanceof BottleMilk) {
                BottleMilk bottleMilk = (BottleMilk) product;
                if (bottleMilk.getName().equals(name) && bottleMilk.getVolume() == volume) {
                    return bottleMilk;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name, int calories) {
        for (Product product : products) {
            if (product instanceof Chocolate) {
                Chocolate chocolate = (Chocolate) product;
                if (chocolate.getName().equals(name) && chocolate.getCalories() == calories) {
                    return chocolate;
                }
            }
        }
        return null;
    }
}
