import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Person> setPerson = new HashSet<>();
        setPerson.add(new Person("Jon", 23, 400));
        setPerson.add(new Person("Harry", 30, 800));
        setPerson.add(new Person("Harry", 24, 600));
        setPerson.add(new Person("Harry", 29, 750));
        setPerson.add(new Person("Nike", 24, 950));
        setPerson.add(new Person("Jerry", 82, 900));
        setPerson.add(new Person("Jenifer", 29, 300));

//        setPerson.stream().sorted((start,end) -> start.getName().compareTo(end.getName())).forEach(System.out::println);                   //Сортировка по имени

//        setPerson.stream().filter(s -> s.getName().indexOf('J') == 0).forEach(System.out::println);                                      //Сортировка по букве J

        /*
        Сначала отфильтровать сотрудников по ЗП>500 затем написать сортировку по 2-м параметрам
         */
        Comparator<Person> comparatorByName = Comparator.comparing(Person::getName).thenComparing(Person::getAge);
        setPerson.stream().sorted(comparatorByName).filter(n -> n.getSalary() > 500).forEach(System.out::println);


    }
}

