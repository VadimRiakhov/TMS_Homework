package Lesson20.Task3;

public class Manufacturer implements Runnable{
    private Shop shop;
    private int productsToProduce;

    public Manufacturer(Shop shop, int productsToProduce) {
        this.shop = shop;
        this.productsToProduce = productsToProduce;
    }

    @Override
    public void run() {
        try{
            for (int i = 1; i <=productsToProduce ; i++) {
                shop.produce();
                Thread.sleep(500);
            }
            System.out.printf("Произведено %d товаров\n", productsToProduce);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
