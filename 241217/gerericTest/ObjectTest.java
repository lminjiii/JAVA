package gerericTest;

import java.util.ArrayList;
import java.util.List;

public class ObjectTest {
    public static void main(String[] args) {
        Object dog = new Dog();
        Object cat = new Cat();
        List<Object> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(cat);

        String name = ((Dog) dog).getName();
        System.out.println(name);

        Cat mycat = (Cat) cat;
        System.out.println(mycat.getName());
    }
}
