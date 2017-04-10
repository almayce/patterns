package behavioral.visitor;

/**
 * Created by almayce on 08.04.17.
 */
public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);

    }
}
