package structural.decorator;

/**
 * Created by almayce on 06.04.17.
 */
public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write java code.";
    }
}
