package JavaOOPSem1;

//        Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад -> калории) и включить в список продуктов в вендинг машину.
//        Продемонстрировать работу класса по продаже товаров (как мы это делали на семинаре).

public class Chocolate extends Product {
    private int calories;

    public int getCalories(){
        return calories;
    }

    public Chocolate (String brand, String name, double price, int calories) {
        super(brand, name, price);
        this.calories = calories;
    }


    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %.2f; Калорий: %d",
                brand, name, price, calories);
    }
}
