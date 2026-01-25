package Task4;

import java.util.Arrays;

/*
    Задача *:
    Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
    работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
    основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
    классов(т.е. это generic).
    Предусмотреть операции(методы):
    1. добавления элемента
    2. удаления элемента
    3. получение элемента по индексу
    4. проверка есть ли элемент в коллекции
    5. очистка всей коллекции
    Предусмотреть конструктор без параметров - создает массив размером
    по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
    массива. Предусмотреть возможность автоматического расширения коллекции при
    добавлении элемента в том случае, когда коллекция уже заполнена
 */

public class ArrayCollection<T> {
    private static final int CAPACITY = 5;
    private Object[] elements;
    private int size;

    // конструктор по умолчанию
    public ArrayCollection(){
        this.elements = new Object[CAPACITY];
        this.size = 0;
    }

    // конструктор с указанием размера массива
    public ArrayCollection(int capacity){
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative: " + capacity);
        }
        this.elements = new Object[capacity];
        this.size = 0;
    }

    // получение элемента по индексу
    public T get(int index){
        checkIndex(index);
        return (T) elements[index];

    }

    // добавление элемента
    public void add(T element){
        checkCapacity();
        elements[size] = element;
        size++;
    }

    // удаление элемента
    public void remove(int index){
        // проверяем индекс
        checkIndex(index);
        // сдвигаем все элементы после индекса
        System.arraycopy(elements, index+1, elements, index, size-index-1);
        elements[size-1]=null;
        size--;
    }

    // проверка наличия элемента в коллекции
    public boolean contains(T element){
        for (int i=0; i<size; i++) {
            if(element.equals(elements[i])){
                return true;
            }
        }
        return false;
    }

    // очистка коллекции
    public void clear(){
        for (int i = 0; i < size; i++) {
            elements[i]=null;
        }
        size = 0;
    }

    // метод для проверки индекса
    public void checkIndex(int index){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // метод для расширения коллекции
    private void checkCapacity(){
        if(size== elements.length){
            int newCapacity = elements.length*2;
            if(newCapacity==0){
                newCapacity=1;
            }
            elements = Arrays.copyOf(elements,newCapacity);
        }
    }

    // получение текущего размера коллекции
    public int size() {
        return size;
    }

    // проверка наличия элементов
    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if(!isEmpty()){
            for (int i=0; i<size; i++) {
                sb.append(elements[i]);
                if(i<size-1){
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
