package behavioral.visitor;

/**
 * Created by almayce on 08.04.17.
 */
public interface Developer {
    public void create(ProjectClass projectClass);
    public void create(Database database);
    public void create(Test test);
}
