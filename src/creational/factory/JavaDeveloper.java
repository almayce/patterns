package creational.factory;

/**
 * Created by almayce on 05.04.17.
 */
public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println(this.getClass().getSimpleName() + " writeJavaCode");

    }
}
