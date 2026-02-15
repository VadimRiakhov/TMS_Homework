package Lesson20.Task3;

/*
Задача *:
Имеются сущности Магазин, Производитель, Покупатель. Цель задачи сделать так чтобы
производитель произвел 5 единиц продукта, а покупатель их купил. Пока производитель
не произвел продукт, покупатель не может его купить. При этом одновременно в магазине
может находиться не более 3 товаров.
 */
public class Task3 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        int productsCount = 5;

        Manufacturer manufacturer = new Manufacturer(shop, productsCount);
        Customer customer = new Customer(shop, productsCount);
        Thread manufacturerThread = new Thread(manufacturer, "Производитель");
        Thread customerThread = new Thread(customer, "Покупатель");

        // Запускаем потоки
        manufacturerThread.start();
        customerThread.start();

        try {
            manufacturerThread.join();
            customerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nВсе операции завершены!");
    }
}
