package Academic_Excellence_Exam_From_Anudeep_Fundation;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + '\'' + '}';
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of Person objects
        LinkedList<Person> personList = new LinkedList<>();
        personList.add(new Person(1, "Ratan"));
        personList.add(new Person(2, "Priya"));
        personList.add(new Person(1, "Ratan")); // Duplicate
        personList.add(new Person(4, "Anjani"));
        personList.add(new Person(2, "Ratan"));   // Duplicate

        System.out.println("Original LinkedList:");
        System.out.println(personList);

        // Remove duplicates from the LinkedList
        removeDuplicates(personList);

        System.out.println("\nLinkedList after removing duplicates:");
        System.out.println(personList);
    }

    private static void removeDuplicates(LinkedList<Person> list) {
        HashSet<Person> uniqueSet = new HashSet<>();
        LinkedList<Person> result = new LinkedList<>();

        for (Person person : list) {
            if (uniqueSet.add(person)) {
                result.add(person);
            }
        }

        list.clear();
        list.addAll(result);
    }
}
