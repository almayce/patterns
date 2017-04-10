package behavioral.visitor;

/**
 * Created by almayce on 08.04.17.
 */
public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
developer.create(this);
    }
}
