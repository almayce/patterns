package behavioral.iterator;

/**
 * Created by almayce on 07.04.17.
 */
public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgleSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Alex Kolch", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
