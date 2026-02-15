package Lesson20.Task3;

public class Customer implements Runnable{
    private Shop shop;
    private int productsToBuy;

    public Customer(Shop shop, int productsToBuy) {
        this.shop = shop;
        this.productsToBuy = productsToBuy;
    }

    @Override
    public void run() {
        try{
            for (int i = 1; i <=productsToBuy ; i++) {
                shop.buy();
                Thread.sleep(1000); // имитация времени между покупками
            }
            System.out.printf("Покупатель купил %d товаров\n", productsToBuy);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
