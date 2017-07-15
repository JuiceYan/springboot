package java8.character.lambda;

import java8.character.lambda.entity.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by admin on 2017/7/8.
 */
public class PersonTest {
    @Test
    public void test1(){
        List<Person> persons = initPersons(10);
        long count = persons.stream().filter(person->person.getAge() > 15).peek(person1 -> System.out.println(person1.getName()+" "+person1.getAge())).count();
        System.out.println(count);

        printPersonsOlderThan(persons,15);
    }

    @Test
    public void test2(){
        List<Person> persons = initPersons(10);
        Predicate<Person> filter1 = person -> person.getAge()>=9;
        Predicate<Person> filter2 = person -> person.getAge()<12;
        long count =persons.stream().filter(person -> person.getAge()>=9).filter(person -> person.getAge()<12).peek(person -> System.out.println(person.getName()+" "+person.getAge())).count();
        long count2 =persons.stream().filter(filter1.and(filter2)).peek(person -> System.out.println(person.getName()+" "+person.getAge())).count();
        System.out.println(count+" "+count2);
        printPersonsWithinAgeRange(persons,9,12);
    }
    private List<Person> initPersons(int amount) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i <  amount; i++){
            Person person = new Person("Bob"+i,10+i);
            persons.add(person);
        }
        return persons;
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() > age) {
                System.out.println(p.getName()+" "+p.getAge());
            }
        }
    }

    public static void printPersonsWithinAgeRange(
            List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                System.out.println(p.getName()+" "+p.getAge());
            }
        }
    }
}
