package creational.prototype;

/**
 * Created by almayce on 05.04.17.
 */
public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "MyProject", "SourceCode");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println("\n");
        System.out.println(masterClone);
    }
}
