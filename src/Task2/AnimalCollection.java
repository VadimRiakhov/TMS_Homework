package Task2;

import java.util.LinkedList;

public class AnimalCollection {
    LinkedList<String> animals;

    public AnimalCollection() {
        this.animals = new LinkedList<>();
    }

    public AnimalCollection(LinkedList<String> animals) {
        this.animals = animals;
    }

    public void addAnimal(String animal){
        animals.addFirst(animal);
        System.out.println("Добавлено животное "+animal);
    }

    public void removeAnimal(){
        if(animals.isEmpty()){
            System.out.println("В коллекции нет животных для удаления!");
        }
        String removedAnimal = animals.removeLast();
        System.out.println("Удалено животное "+removedAnimal);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (String animal : animals) {
            sb.append(animal);
            sb.append(", ");
        }
        if (sb.length() >= 2) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("]");
        return sb.toString();
    }


}
