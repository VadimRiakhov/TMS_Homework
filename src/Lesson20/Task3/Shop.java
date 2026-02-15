package Lesson20.Task3;

public class Shop {
    private int productCount = 0;
    private final int MAX_PRODUCTS = 3;
    // добавление товара
    public synchronized void produce() throws InterruptedException{
        while (productCount>= MAX_PRODUCTS){
            System.out.println("Магазин полон! Производитель ждет");
            wait();
        }

        productCount++;
        System.out.println("Производитель добавил товар в магазин. Количество товаров в магазине: "+productCount);
        notifyAll(); // уведомляем, что товар появился
    }

    // покупка товара
    public synchronized void buy() throws InterruptedException {
        while (productCount<=0){
            System.out.println("Товаров нет! Покупатель ждет");
            wait();
        }

        productCount--;
        System.out.println("Покупатель купил товар. Товаров в магазине: "+productCount);
        notifyAll(); // уведомляем производителя, что появилось свободное место для товара
    }

}
