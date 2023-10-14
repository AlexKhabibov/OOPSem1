package JavaOOPSem1;

public class BottleMilk extends Product{
    private double volume; //объем воды бутылки молока
    private double fat; //жирность бутылки молока

    public double getVolume() {
        return volume;
    }

    public double getFat() {
        return fat;
    }

    public BottleMilk(String brand, String name, double price, double volume) {
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с молоком] %s - %s - %.2f; Объем: %.1f",
                brand, name, price, volume, fat);
    }
}
