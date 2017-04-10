package behavioral.visitor;

/**
 * Created by almayce on 08.04.17.
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in action...");
        project.beWritten(junior);

        System.out.println("Senior in action...");
        project.beWritten(senior);
    }
}
