package JavaOOPSem1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product();
//        product1.name = "Продукт 1";
//        product1.brand = "Производитель 1";
//        product1.price = 200;

        System.out.println(product1.displayInfo());

        Product product2 = new Product();
        System.out.println(product2.displayInfo());


        Product product3 = new Product("Продукт 3", "Производитель 3", 0);

        product3.setPrice(-300);
        product3.setName("K");
        product3.setBrand("KJUJK");

        System.out.println(product3.displayInfo());

        Product bottleWater = new BottleWater("Бренд", "Бутылка с водой", 200, 0.5);
        System.out.println(bottleWater.displayInfo());

        Product bottleWater2 = new BottleWater("Бренд2", "Бутылка с водой2", 250, 0.7);
        System.out.println(bottleWater2.displayInfo());

        Product bottleMilk = new BottleMilk("Бренд", "Бутылка с молоком", 300, 0.7);
        System.out.println(bottleMilk.displayInfo());

        Product bottleMilk2 = new BottleMilk("Бренд", "Бутылка с молоком2", 400, 1);
        System.out.println(bottleMilk2.displayInfo());

        Product chocolate = new Chocolate("Бренд", "Шоколад", 600, 1000);
        System.out.println(chocolate.displayInfo());

        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleMilk);
        products.add(bottleWater);
        products.add(bottleWater2);
        products.add(bottleMilk2);
        products.add(chocolate);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleMilk bottleMilk3 = vendingMachine.getBottleMilk("Бутылка с молоком", 0.7);
        if (bottleMilk3 == null){
            System.out.println("Такого товара нет");
        }
        else {
            System.out.println("Вы купили товар:");
            System.out.println(bottleMilk3.displayInfo());
        }

        VendingMachine vendingMachine1 = new VendingMachine(products);
        Chocolate chocolate1 = vendingMachine1.getChocolate("Шоколад", 1000);
        if (bottleMilk3 == null){
            System.out.println("Такого товара нет");
        }
        else {
            System.out.println("Вы купили товар:");
            System.out.println(chocolate1.displayInfo());
        }
    }

}
