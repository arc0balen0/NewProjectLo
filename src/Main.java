import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Иван", "Иванов", 35));
        persons.add(new Person("Петр", "Петрович Иванов", 25));
        persons.add(new Person("Сергей", "Сергеевич Сергеев", 45));

        Collections.sort(persons, (p1, p2) -> {
            String[] p1SurnameWords = p1.getSurname().split(" ");
            String[] p2SurnameWords = p2.getSurname().split(" ");

            int p1SurnameWordCount = p1SurnameWords.length;
            int p2SurnameWordCount = p2SurnameWords.length;

            if (p1SurnameWordCount != p2SurnameWordCount) {
                return Integer.compare(p2SurnameWordCount, p1SurnameWordCount);
            } else {
                return Integer.compare(p2.getAge(), p1.getAge());
            }
        });

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}


