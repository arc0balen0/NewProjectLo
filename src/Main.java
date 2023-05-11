import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Иван", "Иванов", 35));
        persons.add(new Person("Петр", "Петрович Иванов", 25));
        persons.add(new Person("Алексей", "Алексеев", 15)); // Добавлено для демонстрации
        persons.add(new Person("Елена", "Еленова", 15)); // Добавлено для демонстрации

        persons.removeIf(person -> {
            if (person.getAge() < 18) {
                return true; // Удаляем, если возраст меньше 18
            } else {
                return false; // Не удаляем, если возраст не меньше 18
            }
        });

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
