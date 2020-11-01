import java.util.ArrayList;
import java.util.Scanner;

class SelectionContext {
    private PersonSelectionAlgorithm algorithm;
    public void setAlgorithm(PersonSelectionAlgorithm algorithm) {
        // write your code here
        this.algorithm = algorithm;
    }
    public Person[] selectPersons(Person[] persons) {
        // write your code here
        return algorithm.select(persons);
    }
}

interface PersonSelectionAlgorithm {
    Person[] select(Person[] persons);
}

class TakePersonsWithStepAlgorithm implements PersonSelectionAlgorithm {
    int k;
    public TakePersonsWithStepAlgorithm(int step) {
        // write your code here
        this.k = step;
    }
    @Override
    public Person[] select(Person[] persons) {
        // write your code here
        if(k==1 | persons.length == 1){
            return persons;
        } else {
            ArrayList<Person> p = new ArrayList<Person>();
            for (int i = 0; i < persons.length; i+= k) {
                p.add(persons[i]);
            }
            Person[] pArray = new Person[p.size()];
            for (int i = 0; i < p.size(); i++) {
                pArray[i] = p.get(i);
            }
            return pArray;
        }
    }
}


class TakeLastPersonsAlgorithm implements PersonSelectionAlgorithm {
    int k;
    public TakeLastPersonsAlgorithm(int count) {
        // write your code here
        this.k = count;
    }
    @Override
    public Person[] select(Person[] persons) {
        // write your code here
        if (k == 1 | persons.length == 1) {
            Person[] a = new Person[1];
            a[0] = persons[persons.length -1];
            return a;
        } else
        { ArrayList<Person> p = new ArrayList<Person>();
            int j = persons.length - k;
            for (int i = j; i < persons.length; i++) {
                p.add(persons[i]);
            }
            Person[] pArray = new Person[p.size()];
            for (int i = 0; i < p.size(); i++) {
                pArray[i] = p.get(i);
            }
            return pArray;
        }
    }
}

class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int count = Integer.parseInt(scanner.nextLine());
        final Person[] persons = new Person[count];

        for (int i = 0; i < count; i++) {
            persons[i] = new Person(scanner.nextLine());
        }

        final String[] configs = scanner.nextLine().split("\\s+");

        final PersonSelectionAlgorithm alg = create(configs[0], Integer.parseInt(configs[1]));
        SelectionContext ctx = new SelectionContext();
        ctx.setAlgorithm(alg);

        final Person[] selected = ctx.selectPersons(persons);
        for (Person p : selected) {
            System.out.println(p.name);
        }
    }

    public static PersonSelectionAlgorithm create(String algType, int param) {
        switch (algType) {
            case "STEP": {
                return new TakePersonsWithStepAlgorithm(param);
            }
            case "LAST": {
                return new TakeLastPersonsAlgorithm(param);
            }
            default: {
                throw new IllegalArgumentException("Unknown algorithm type " + algType);
            }
        }
    }
}