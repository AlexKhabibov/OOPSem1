package JavaOOPSem1;

public class BottleWater extends Product{
    private double volume; //объем воды бутылки молока

    public double getVolume() {
        return volume;
    }

    public BottleWater (String brand, String name, double price, double volume){
         super(brand, name, price);
         this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с водой] %s - %s - %.2f; Объем: %.1f",
                brand, name, price, volume);
    }
}
