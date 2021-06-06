package section2;

import java.util.List;
import java.util.ArrayList;

class Person implements Comparable<Person> {
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}

@FunctionalInterface
interface NameGetter {
    String get(Person p);
}

@FunctionalInterface
interface NameSetter {
    void set(Person p, String name);
}

@FunctionalInterface
interface Print {
    void print(String str);
}

@FunctionalInterface
interface PersonCreator {
    Person create();
}

@FunctionalInterface
interface PersonNameCreator {
    Person create(String name);
}

public class MyMethodRef2 {

    public static void main(String[] args) {

        // <-- s1
        Person person = new Person("Joe");

        NameGetter getter1 = p -> p.getName();
        NameGetter getter2 = Person::getName;

        System.out.println(getter1.get(person));
        System.out.println(getter2.get(person));

        NameSetter setter1 = (p, name) -> p.setName(name);
        NameSetter setter2 = Person::setName;

        setter1.set(person, "Daniel");
        System.out.println(getter2.get(person));

        setter2.set(person, "Mikael");
        System.out.println(getter2.get(person));
        // -->

        // <-- s2
        List<Person> people = new ArrayList<>(List.of(
        new Person("Joe"),
        new Person("Mary"),
        new Person("Simon")
        ));

        people.sort(Person::compareTo);
        people.forEach(System.out::println);
        // -->

        // <--s3
        PersonCreator c1l = ()->new Person();
        PersonNameCreator c2l = (name) -> new Person(name);

        PersonCreator c1 = Person::new;
        PersonNameCreator c2 = Person::new;

        NameGetter g = Person::getName;
       
        System.out.println(g.get(c1.create()));
        System.out.println(g.get(c2.create("Joseph")));
        // -->
    }

}
