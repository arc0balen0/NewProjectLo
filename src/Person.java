public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return surname.compareTo(o.surname);
    }


    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}

